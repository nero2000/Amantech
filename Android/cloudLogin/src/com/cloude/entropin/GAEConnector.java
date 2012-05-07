package com.cloude.entropin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class GAEConnector {

        private String _accountName;
        private Cookie _authCookie;
        private String _gaeAppBaseUrl; // example: "http://urldiff.appspot.com";
        private String _gaeAppLoginUrl; // base + "/_ah/login";
        private boolean _usehttps;

        private String _lastContent; // content filled by a GET or a POST
        private int _lastHttpCode; // filled by GET or POST

        /**
         * 
         */
        public GAEConnector(String accountName, String gaeAppBaseUrl) {
                _accountName = accountName;
                _gaeAppBaseUrl = gaeAppBaseUrl;
                _gaeAppLoginUrl = _gaeAppBaseUrl + "/_ah/login";
                _usehttps = gaeAppBaseUrl.startsWith("https");
        }

        /**
         * 
         */
        public String getLastContent() {
                return _lastContent;
        }

        /**
         * 
         */
        public int getLastHttpCode() {
                return _lastHttpCode;
        }

        /**
         * 
         */
        public boolean isAuthenticated() {
                return _authCookie != null;
        }

        /**
         * Exec authentication
         */
        public boolean Authenticate(Context context) {
                try {
                        // Two attempts. The first is the "normal" run. The second recreate
                        // the authToken if the first attempt fails authentication (it
                        // invalidates the current authToken)
                        for (int i = 0; i < 2; i++) {
                                String authToken = this.buildAuthToken(context, i > 0);
                                _authCookie = this.retrieveAuthCookie(authToken);
                                if (_authCookie != null)
                                        return true;
                        }
                        return false;
                } catch (Exception e) {
                        Log.e("Authenticate", "ERROR " + e.toString());
                        return false;
                }
        }

        /**
         * Build auhtentication token from AccountManager
         */
        private String buildAuthToken(Context context, boolean invalidateCurrent) {
                Log.v("GAEConnector", "buildAuthToken - invalidateCurrent=" + invalidateCurrent);

                String authToken = null;
                try {
                        AccountManager mgr = AccountManager.get(context);
                        Account account = null;
                        if (_accountName == null)
                                account = mgr.getAccountsByType("com.google")[0];
                        else
                                account = new Account(_accountName, "com.google");

                        // Notice: I don't know where is the documentation but "ah" means
                        // "Google App Engine".
                        // If I use it, Android asks for authorization to
                        // auhtenticate the user on Google App Engine. If I change it,
                        // Android does not ask for "Google App Engine".
                        AccountManagerFuture<Bundle> accountManagerFuture = mgr.getAuthToken(account, "ah", null,
                                        (Activity) context, null, null);

                        Bundle authTokenBundle = accountManagerFuture.getResult();
                        authToken = authTokenBundle.get(AccountManager.KEY_AUTHTOKEN).toString();
                        Log.v("authToken", authToken);

                        if (invalidateCurrent) {
                                mgr.invalidateAuthToken(account.type, authToken);
                                authToken = this.buildAuthToken(context, false);
                        }

                } catch (Exception ex) {
                        ex.printStackTrace();
                        Log.v("buildAuthToken", "EXCEPTION: " + ex.toString());
                }

                return authToken;
        }

        /**
         * Get AuthCookie from App Engine
         */
        private Cookie retrieveAuthCookie(String authToken) throws ClientProtocolException, IOException {

                // Authentication URL
                String url = _gaeAppLoginUrl + "?continue=" + URLEncoder.encode(_gaeAppBaseUrl, "UTF-8") + "&auth="
                                + URLEncoder.encode(authToken, "UTF-8");
                Log.d("retrieveAuthCookie", "cookieUrl = " + url);

                // HttpClient (without following redirects!)
                DefaultHttpClient httpClient = new DefaultHttpClient();
                BasicHttpParams params = new BasicHttpParams();
                HttpClientParams.setRedirecting(params, false);
                httpClient.setParams(params);

                // Execute Http GET
                HttpGet httpget = new HttpGet(url);
                HttpResponse response = httpClient.execute(httpget);
                if (response.getStatusLine().getStatusCode() != 302)
                        return null;

                // Get the AuthCookie
                Cookie theCookie = null;
                String cookieName = _usehttps ? "SACSID" : "ACSID";
                for (Cookie c : httpClient.getCookieStore().getCookies()) {
                        if (c.getName().equals(cookieName)) {
                                theCookie = c;
                                Log.v("retrieveAuthCookie", "TheCookie: " + theCookie.getName() + " = " + theCookie.getValue());
                        }
                }
                return theCookie;
        }

        // ********************************************************************************************************

        /**
         * 
         */
        public int GETContent(String relativeUrl, boolean authenticated, boolean disableRedirect) throws Exception {

                // Setup Http Client
                DefaultHttpClient httpClient = this.CreateHttpClient(disableRedirect);
                HttpGet httpget = new HttpGet(_gaeAppBaseUrl + relativeUrl);
                this.SetHttpRequestAuthCookie(httpget, authenticated);

                // Execute HTTP GET
                HttpResponse httpResp = httpClient.execute(httpget);
                _lastHttpCode = httpResp.getStatusLine().getStatusCode();
                Log.d("GetContent", "httpStatusCode: " + _lastHttpCode);

                // Read response content
                _lastContent = this.ReadTextFromHttpResponse(httpResp);
                Log.v("GetContent", "content=" + _lastContent);
                return _lastHttpCode;
        }

        /**
         * 
         */
        public int POSTContent(String relativeUrl, List<NameValuePair> params, boolean authenticated,
                        boolean disableRedirect) throws Exception {

                // Setup Http Client
                DefaultHttpClient httpClient = this.CreateHttpClient(disableRedirect);
                HttpPost httpPost = new HttpPost(_gaeAppBaseUrl + relativeUrl);
                if (params != null) {
                        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
                        httpPost.setEntity(entity);
                }
                this.SetHttpRequestAuthCookie(httpPost, authenticated);

                // Execute HTTP POST
                HttpResponse httpResp = httpClient.execute(httpPost);
                _lastHttpCode = httpResp.getStatusLine().getStatusCode();
                Log.v("GetContent", "httpStatusCode: " + _lastHttpCode);

                // Read response content
                _lastContent = this.ReadTextFromHttpResponse(httpResp);
                Log.v("GetContent", "content=" + _lastContent);
                return _lastHttpCode;
        }

        /**     
         * 
         */
        public int POSTContentBody(String relativeUrl, String body, boolean authenticated, boolean disableRedirect)
                        throws Exception {

                // Setup Http Client
                DefaultHttpClient httpClient = this.CreateHttpClient(disableRedirect);
                HttpPost httpPost = new HttpPost(_gaeAppBaseUrl + relativeUrl);
                this.SetHttpRequestAuthCookie(httpPost, authenticated);
                ByteArrayEntity entity = new ByteArrayEntity(body.getBytes("UTF-8"));
                httpPost.setEntity(entity);

                // Execute HTTP POST
                HttpResponse httpResp = httpClient.execute(httpPost);
                _lastHttpCode = httpResp.getStatusLine().getStatusCode();
                Log.v("GetContent", "httpStatusCode: " + _lastHttpCode);

                // Read response content
                _lastContent = this.ReadTextFromHttpResponse(httpResp);
                Log.v("GetContent", "content=" + _lastContent);
                return _lastHttpCode;
        }

        /**     
         * 
         */
        private String ReadTextFromHttpResponse(HttpResponse httpResp) throws IllegalStateException, IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(httpResp.getEntity().getContent()));
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = reader.readLine()) != null) {
                        sb.append(line);
                }
                reader.close();
                return sb.toString();
        }

        /**
         *  
         */
        private void SetHttpRequestAuthCookie(HttpRequestBase httpReq, boolean authenticated) throws Exception {
                if (authenticated) {
                        if (_authCookie != null)
                                httpReq.setHeader("Cookie", _authCookie.getName() + "=" + _authCookie.getValue());
                        else
                                throw new Exception("The connector is not currently authenticated");
                }
        }

        /**      
         * 
         */
        private DefaultHttpClient CreateHttpClient(boolean disableRedirect) {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                if (disableRedirect) {
                        BasicHttpParams params = new BasicHttpParams();
                        HttpClientParams.setRedirecting(params, false);
                        httpClient.setParams(params);
                        /*
                         * //Metodo altenativo:
                         * 
                         * httpClient.setRedirectHandler(new DefaultRedirectHandler() {
                         * 
                         * @Override public boolean isRedirectRequested(HttpResponse
                         * response, HttpContext context) { return false; } });
                         */
                }
                return httpClient;
        }

}
