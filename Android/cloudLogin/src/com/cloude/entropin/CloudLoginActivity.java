package com.cloude.entropin;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.CookieStore;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CloudLoginActivity extends Activity {
	
	
	private AccountManager am;
	private Activity       activity;
	private String         token;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        am = AccountManager.get(this);
        activity = this;
        final Account[] accounts = am.getAccountsByType("com.google");// Get an instance and retrieve all google accounts.
        final List<String> accountNames = new ArrayList<String>();
        for (Account account : accounts)
            accountNames.add(account.name);
        ListView accountList = (ListView) findViewById(R.id.st_account_list);// st_account_list is defined in an XML layout
        accountList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, accountNames));
        
        accountList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				Bundle options = new Bundle();
				am.getAuthToken(
						accounts[pos],                     // Account retrieved using getAccountsByType()
				    "Manage your tasks",            // Auth scope
				    options,                        // Authenticator-specific options
				    activity,                           // Your activity
				    new OnTokenAcquired(),          // Callback called when a token is successfully acquired
				    null);    // Callback called if an error occurs
				
				 Log.d("test","cliking");
				
			}
		} );
        
        
    }
    /*
     * 
     * Show the html and loop all cookies
     */
    
    private void showCookie(String token){
    	
    	try {
    	 
        HttpGet http_get = new HttpGet("https://cloudappstudio360.appspot.com/_ah/login?continue="+ URLEncoder.encode("https://cloudappstudio360.appspot.com/tool/appbuilder/", "UTF-8")+ "&auth=" + URLEncoder.encode(token, "UTF-8")+"");
        DefaultHttpClient client = new DefaultHttpClient();
        
        client.getParams().setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
		HttpResponse response = client.execute(http_get);

         int respCode = response.getStatusLine().getStatusCode();
         if (respCode == HttpURLConnection.HTTP_OK || respCode == HttpURLConnection.HTTP_MOVED_TEMP)
         {
             for (Cookie cookie : client.getCookieStore().getCookies())
             {
                 //Cookies
             }
         }
         

		String content = EntityUtils.toString(response.getEntity());
		Log.d("content",content);
		client.getConnectionManager().shutdown();
		
		Log.d("test","all is good");
		
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    /*
     * 
     * Callback when we retrive the  Token
     */
    
    private class OnTokenAcquired implements AccountManagerCallback<Bundle> {
        @Override
        public void run(AccountManagerFuture<Bundle> result) {
        	try {
            // Get the result of the operation from the AccountManagerFuture.
            Bundle bundle = null;

				bundle = result.getResult();
			
            // The token is a named value in the bundle. The name of the value
            // is stored in the constant AccountManager.KEY_AUTHTOKEN.
            token = bundle.getString(AccountManager.KEY_AUTHTOKEN);
            Log.d("test",token);
            
            
            //All networking need to be in separate thread
            new Thread(new Runnable() {
                public void run() {
                	showCookie(token);
                }
              }).start();
            
            
            
        	} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
           
        }
}