package com.cloudappstudio.android;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

public class Helper
{
	public static final String appsURL = "https://cloudappstudio360.appspot.com/api/json/v2/apps.json";
	private static String cookies = null;// This should of course be changed
	private static long cookieSetTimeStamp = 0;

	public static void restartApp(Context context)
	{
		Intent intent = new Intent(context, CloudAppStudioAndroidActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		context.startActivity(intent);

	}

	public static String getCookies()
	{
		// Clear cookie after 30 minutes
		int minutes = 1000 * 60 * 30;
		long expire = cookieSetTimeStamp + minutes;

		if (System.currentTimeMillis() > (expire))
			return null;
		return cookies;
	}

	public static void setCookies(String s)
	{
		cookieSetTimeStamp = System.currentTimeMillis();
		cookies = s;
	}

	public static String getURL(String url)
	{
 
		try
		{
			// OK lets list all apps
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			request.addHeader("Cookie", Helper.cookies);
			HttpResponse response;

			response = client.execute(request);
			String content = IOUtils.toString(response.getEntity().getContent());
			client.getConnectionManager().shutdown();
			return content;

		} catch (Exception e)
		{
			e.printStackTrace() ;
		}
		return null;
	}

	public static String toJson(Object obj)
	{
		JSONSerializer serializer = new JSONSerializer();
		return serializer.serialize(obj);
	}
	public static void showToast(final Activity activity, final String message)
	{
		Runnable run = new Runnable()
		{
			public void run() {
				Toast.makeText(activity, message, Toast.LENGTH_LONG).show();
			}
		};
		 activity.runOnUiThread(run);
	}
	public static Object fromJson(String json)
	{
		JSONDeserializer deserializer = new JSONDeserializer();
		return deserializer.deserialize(json);
	}
	public static String getLoginURL()
	{
		return "https://cloudappstudio360.appspot.com/app/lSHbx5Nj/script/getcookie";
	}
	public static String getBaseURL()
	{
		return "https://cloudappstudio360.appspot.com";
	}
	public static String getJQueryHTML()
	{
		String h = "<script src='file:///android_asset/jquery.js'></script>" + 
				"<script src='file:///android_asset/jquery-ui.min.js'></script>" + 
				"<link rel='stylesheet' type='text/css' href='file:///android_asset/jqueryui.css' />";
				
		return h;
	}
}
