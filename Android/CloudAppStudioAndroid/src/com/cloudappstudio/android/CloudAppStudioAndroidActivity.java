package com.cloudappstudio.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

 
/**
 *  Activity responsible for fetching to session cookie
 */
public class CloudAppStudioAndroidActivity extends Activity
{
 	private final String TAG = "" + this.getClass().getName();

	@Override
	public void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);

		Log.d(TAG, "onCreate");
		CookieSyncManager.createInstance(this);
		CookieManager cookieManager = CookieManager.getInstance();
		cookieManager.setAcceptCookie(true);
		
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		CookieSyncManager.getInstance().startSync();
	 	logIn();
	 }

	private void logIn()
	{
		Toast.makeText(this, "Logging in", Toast.LENGTH_LONG).show();
		TextView tv = new TextView(this);
		tv.setText("Loading..");
		this.setContentView(tv);
		final Context context = this;

		WebView webView = new WebView(this);
	 	webView.getSettings().setJavaScriptEnabled(true);
		WebViewClient yourWebClient = new WebViewClient()
		{
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url)
			{
				view.loadUrl(url);
				return false;
			}

		};
		webView.setWebViewClient(yourWebClient);
		webView.setId(111);
		 

		class JavaScriptInterface
		{
			Context mContext;

			/** Instantiate the interface and set the context */
			JavaScriptInterface(Context c)
			{
				mContext = c;
			}

			public void setCookies(String cookiesStr)
			{
			 	Helper.setCookies(cookiesStr);  
				// CookieSyncManager.getInstance().sync();
		 
				Runnable run = new Runnable()
				{
					public void run()
					{
						startAppListActivity();
					}
				};
				 runOnUiThread(run); 
			}
		}
	 	webView.addJavascriptInterface(new JavaScriptInterface(this), "Android");

		webView.loadUrl( Helper.getLoginURL());
		setContentView(webView);
	}

	@Override
	protected void onPause()
	{
 
		super.onPause();
	 	CookieSyncManager.getInstance().stopSync();
	}

	public void startAppListActivity()
	{
		try
		{
			Intent i = new Intent(this, AppListActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
		} catch (Exception e)
		{
			Toast.makeText(this, "" + e, Toast.LENGTH_LONG).show();
			
		}
	}

}