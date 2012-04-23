package com.cloudappstudio.android;

import java.util.List;
import java.util.Map;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
/**
 * 
 * @author Dick Larsson
 * 
 * Activity responsible for listing the uers apps
 *
 */
public class AppListActivity extends Activity
{

	private String markup = null;
 
 	private View view = null;
 	private List<Map> apps = null;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setTitle("Cloud App Studio");

		final Context context = this;
		final WebView webView = new WebView(this);
		view = webView;
		webView.getSettings().setJavaScriptEnabled(true);
	 

	 
		webView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		webView.loadDataWithBaseURL(null, "Loading..", "text/html", "UTF-8", null);

		class JavaScriptInterface
		{
			Context mContext;

			/** Instantiate the interface and set the context */
			JavaScriptInterface(Context c)
			{
				mContext = c;
			}

			public void gotoApp(String id)
			{ 
				startAppActivity(id); 
			}
		}
		webView.addJavascriptInterface(new JavaScriptInterface(this), "Android");

		setContentView(webView);

		// UI Thread should not be used for heavy work but in this case its OK
		// since we are just testing

		String url = Helper.getBaseURL() + "/api/json/v2/apps.json";
	 	String json = Helper.getURL(url);
		 // This is NOT optimal, our API returns a Map with error code in case we
		// are not logged on
		Object o = Helper.fromJson(json);
		if (o instanceof Map)
		{
			Map map = (Map) o;
			String error = (String) map.get("error");
			if (error != null)
			{
				markup = "Error: " + error;

			}
		} else if(o instanceof List)
		{
			 apps = (List<Map>) Helper.fromJson(json);
			final StringBuffer html = new StringBuffer();
			markup = getHTMLForAppList(apps);
		}
		webView.loadDataWithBaseURL(null, markup, "text/html", "UTF-8", null);

	}

	public void startAppActivity(final String appId)
	{
		try
		{
			Intent i = new Intent(this, AppActivity.class);

			// Get the app from apps
			for (Map app : apps)
			{
				String id = "" + app.get("id");
				if (id.equals(appId))
				{
					String json = Helper.toJson(app);
					i.putExtra("app", json);
				}
			}

			startActivity(i);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	public String getHTMLForAppList(List apps)
	{
		StringBuffer html = new StringBuffer();
	 	html.append("<html><body>");
		html.append(Helper.getJQueryHTML());
		html.append("You have " + apps.size() + " apps");
		html.append("<table>");
		for (Object obj : apps)
		{
			Map map = (Map) obj;
			String title = map.get("title") + "";
			html.append("<tr>");
			html.append("          <td><img src='file:///android_asset/cas_app_logo_72.png'></td>");
			html.append("<td class='app' id='" + map.get("id") + "'>" + title + "</td></tr>");

		}
		html.append("</table>");
		html.append("<script>" + 
		     "$('.app').click(" +
			"	function()" +  
			"	{ " + 
			"		Android.gotoApp( $(this).attr('id'));" +
			"	}" +
			"  );" + 
		    "</script>");			
		html.append("</body></html>"); 
		return html.toString();
		
	}

}
