package com.cloudappstudio.android;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import flexjson.JSONDeserializer;

public class FormAsViewActivity extends Activity
{
	WebView webView = null;
	Activity thisActivity = null;
	@Override
	protected void onResume()
	{
		super.onResume();
		// The activity has become visible (it is now "resumed").
		if (Helper.getCookies() == null)
		{
			Helper.restartApp(this);

		}
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		thisActivity = this;
		super.onCreate(savedInstanceState);
		setTitle("Cloud App Studio");
		Bundle extras = getIntent().getExtras();
		if (extras == null)
			throw new RuntimeException("Extras cannot be empty");

		String formAsViewURL = (String) extras.getString("formAsViewURL");
		webView = new WebView(this);
		webView.setId(8484);
		setContentView(webView);
		final Context context = this;
		webView.getSettings().setJavaScriptEnabled(true);
		// Stupid, just to get the UI thread to update the webView

		try
		{
			gotoFormAsView(new URL(formAsViewURL));
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

	}

	public static Object fromJson(String json)
	{
		JSONDeserializer deserializer = new JSONDeserializer();
		return deserializer.deserialize(json);
	}

	public void gotoFormAsView(final URL url)
	{
		//Create a Runnable that can run in a Thread in background
		Runnable work = new Runnable()
		{
			public void run()
			{
				String content = Helper.getURL(url.toString()); 
				if(content == null)
					throw new RuntimeException("WTH content null when gotoFormAsView");
				Object obj = Helper.fromJson(content);
			 	
				if(obj instanceof String)
				{
					return;
				}
				Map view = (Map) Helper.fromJson(content);  
				final String html = createViewHTML(view);
				
				//Update UI thread using Runnable/runOnUiThread
				Runnable onUI = new Runnable()
				{
					public void run()
					{

						webView.loadDataWithBaseURL(null, html + "", "text/html", "UTF-8", null);
					}

				};
				runOnUiThread(onUI);
			}

		};

		new Thread(work).start();

	}
	private String createViewHTML(Map view)
	{
		final StringWriter html = new StringWriter();
		PrintWriter out = new PrintWriter(html);

		List columns = (List) view.get("columns");
		List<Map> dataItems = (List<Map>) view.get("view");

		out.println("<html><body><style>h1{font-size: 12px;}th{text-align:left;}</style>");
		out.println("<h1>Form data: " + view.get("title") + " (" + dataItems.size() + ")</h1>");
		out.println("<table>");

		out.println("<tr>");
		for (Object o : columns)
		{
			Map m = (Map) o;
			String name = "" + m.get("label");
			out.println("<th>" + name + "</th>");
		}
		out.println("<th>Create date</th>");
		out.println("</tr>");

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		for (Map dataItem : dataItems)
		{
			out.println("<tr>");
			Map propertiesMap = (Map) dataItem.get("propertiesMap");
			for (Object o : columns)
			{
				Map column = (Map) o;
				String name = (String) column.get("name");
				if (name == null)
					continue;
				if (name.equals(""))
					continue;
				if (name.equals("null"))
					continue;

				String value = "" + propertiesMap.get(name);

				out.println("<td>" + value + "</td>");
			}

			try
			{
				long l = Long.parseLong(dataItem.get("createdDate") + "");
				Date d = new Date(l);
				out.println("<td style='white-space: nowrap'>" + dateFormat.format(d) + "</td>");

			} catch (Exception e)
			{
			}

			out.println("</tr>");
		}

		out.println("</table>");
		out.println("</body></html>");
		
		return html.toString();
	}
}
