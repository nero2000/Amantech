package com.cloudappstudio.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class CloudeOAuth {
	
	public String getToken(Account account, Context context) throws OperationCanceledException, AuthenticatorException, IOException{
		AccountManager mgr = AccountManager.get(context);
		String authToken = null;
        AccountManagerFuture<Bundle> accountManagerFuture = mgr.getAuthToken(account, "oauth2:https://www.googleapis.com/auth/userinfo.email", null,
                        (Activity) context, null, null);
        
        Bundle authTokenBundle = accountManagerFuture.getResult();
        authToken = authTokenBundle.get(AccountManager.KEY_AUTHTOKEN).toString();
        Log.v("authToken", authToken);
        return authToken;
	}
	
	public String getContent(String apiUrl, String token) throws IllegalStateException, IOException{
		
		// HttpClient (without following redirects!)
        DefaultHttpClient httpClient = new DefaultHttpClient();
        BasicHttpParams params = new BasicHttpParams();
        HttpClientParams.setRedirecting(params, false);
        httpClient.setParams(params);

        // Execute Http GET
        //https://cloudappstudio360.appspot.com/api/json/v2/apps.json?userInfoOAuth=ya29.AHES6ZT4Qh27Q8I1LK7onoQpxwNXw2Czp2Wndg8nk0TIzYc
        HttpGet httpget = new HttpGet(apiUrl+"?userInfoOAuth="+token);
        HttpResponse response = httpClient.execute(httpget);
        Log.d("debug", " "+response.getStatusLine().getStatusCode());  
        return this.ReadTextFromHttpResponse(response);
        
	}
	
	
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
}
