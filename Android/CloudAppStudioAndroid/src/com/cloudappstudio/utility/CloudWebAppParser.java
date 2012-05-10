package com.cloudappstudio.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudWebApp;

/**
 * CloudWebAppParser - Parses web application information into CloudWebApp objects
 * @author mrjanek <Jesper Lindberg>
 */
public class CloudWebAppParser {
	private CloudAuthId id;
	
	public CloudWebAppParser(CloudAuthId id) {
		this.id = id;
	}
	
	public List<CloudWebApp> parseFromString(String json) throws JSONException {
		JSONArray outlineArray = new JSONArray(json);
		List<CloudWebApp> webApps = new ArrayList<CloudWebApp>();
		
		for (int i = 0; i < outlineArray.length(); i++) {
			JSONObject appObject = outlineArray.getJSONObject(i);
			
			String title = appObject.getString("title");
			String desc = appObject.getString("description");
			String appName = appObject.getString("name");
			
			webApps.add(new CloudWebApp(title, desc, appName));
		}
		
		return webApps;
	}
	
	public List<CloudWebApp> parseFromCloud() throws IllegalStateException, IOException, JSONException {
		CloudOAuth auth = new CloudOAuth(id);
		String content = auth.getContent(CloudConstants.CAS360_APPS_JSON);
		return parseFromString(content);
	}
}
