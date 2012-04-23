package com.cloudappstudio.android;

 
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;
import flexjson.JSONDeserializer;

public class AppActivity extends Activity
{
	WebView webView = null;  
	Map app = null;

	@Override
	protected void onResume()
	{
		super.onResume();
		 
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	 
		super.onCreate(savedInstanceState);
		setTitle("Cloud App Studio");
		Bundle extras = getIntent().getExtras();
		if (extras == null)
			throw new RuntimeException("Extras cannot be empty");

		final String appJson = extras.getString("app");
		
		
		
		app = (Map) Helper.fromJson(appJson);
		
		//Get the "links"
		Map links = (Map) app.get("links");
		
		//Find the link to forms
		Map formsAttr = (Map) links.get("forms"); 
		
		//Get the url to forms
		String formsURL = formsAttr.get("url") + "";
 
		
		//Get all forms for this app, its important that we exclude *.class (because of the JSON library)
		String content = Helper.getURL( formsURL + "&include=title,id,name&exclude=*.class"); 
		List forms = new ArrayList ();
		
		try
		{
			forms = (List) Helper.fromJson(content);
		}
		catch(Exception e)
		{
			Toast.makeText(this, "Shitty " + e, Toast.LENGTH_LONG).show();
		}
		class JavaScriptInterface
		{
			Context mContext;

			/** Instantiate the interface and set the context */
			JavaScriptInterface(Context c)
			{
				mContext = c;
			}

			public void gotoFormAsView(final String id)
			{

				Runnable run = new Runnable()
				{
					public void run()
					{
						startFormAsView(id);
					}
				};
				runOnUiThread(run);

			}
		}
	 
		webView = new WebView(this);
		webView.setId(8484);
		webView.addJavascriptInterface(new JavaScriptInterface(this), "Android");
 
		setContentView(webView);
	 
		final Context context = this;
		webView.getSettings().setJavaScriptEnabled(true);

 
		String markup = getHTMLForApp(app, forms);
		webView.loadDataWithBaseURL(null, markup, "text/html", "UTF-8", null);

	}

	public static Object fromJson(String json)
	{
		JSONDeserializer deserializer = new JSONDeserializer();
		return deserializer.deserialize(json);
	}

	public void startFormAsView(String formId)
	{
		String url = Helper.getBaseURL() + "/api/json/v2/autoview?formId=" + formId + "&appId=" + app.get("id") + "&exclude=*.class";
		try
		{
			Intent i = new Intent(this, FormAsViewActivity.class); 
			i.putExtra("formAsViewURL", url);
			startActivity(i);
		} 
		catch (Exception e)
		{
			Helper.restartApp(this);
		}

	}
	public String getHTMLForApp(Map item, List<Map> forms )
	{
		String title = item.get("title") + "";
		StringWriter sw = new StringWriter();
		PrintWriter out = new PrintWriter(sw);

		out.println("<html>");
		out.println("<head>" + Helper.getJQueryHTML() + "</head>");
		out.println("<body>");
		out.println("<h1>" + title + "</h1>");
		
		if(forms == null)
			throw new RuntimeException("Forms cannot be null");
		
		out.println("<h2>Forms</h2>");
		for(Map form : forms)
		{
			String t = (String) form.get("title");
			out.println("<br><a class='formLink' id='" + form.get("id") + "'>" + t + "</a>");
		}
		out.println("<script>" + 
			     "$('.formLink').button().css('width', '100%'); $('.formLink').click(" +
				"	function()" +  
				"	{ " + 
				"		Android.gotoFormAsView( $(this).attr('id'));" +
				"	}" +
				"  );" + 
			    "</script>");
		
		out.println("</body>");
		out.println("</html>");
		
		return sw.toString();
	}
	 
}
