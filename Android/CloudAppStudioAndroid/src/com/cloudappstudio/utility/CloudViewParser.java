package com.cloudappstudio.utility;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cloudappstudio.data.CloudView;
import com.cloudappstudio.data.CloudWebApp;

public class CloudViewParser {
	
	private static final String apiUrl = "https://cloudappstudio360.appspot.com/api/json/v2/views.json?appName=";
	private static final String sampleJson = "[{appId:'4c3bdce5-55bd-41b1-9f63-308a9d6a2174',themeId:null,lastModified:null,themeEnabled:false,status:null,sortOrder:-1653304839,viewDataURL:'https://cloudappstudio360.appspot.com:443/api/json/v2/viewdata?appName=zzxeNYK0&viewName=eOTQx3t9',formName:null,type:null,propertiesAsJson:null,id:'db69d854-2be2-49fd-b80e-0db6e095928a',title:'Tillgängliga bostäder',createdBy:null,decorationMode:'alt2',ACLId:null,workflowId:null,name:'eOTQx3t9',lastModifiedBy:null,createdDate:1334081524217}]";

	public List<CloudView> parseFromString(String json) throws JSONException {
		JSONArray outlineArray = new JSONArray(json);
		List<CloudView> views = new ArrayList<CloudView>();
		
		for (int i = 0; i < outlineArray.length(); i++) {
			JSONObject appObject = outlineArray.getJSONObject(i);
			
			String title = appObject.getString("title");
			String viewName = appObject.getString("name");
			
			views.add(new CloudView(title, viewName));
		}
		
		return views;
	}
	
	public List<CloudView> parseFromCloud(String appName) {
		throw new UnsupportedOperationException("Not yet implemented. Need some HTTP download code first.");
	}
	
	public List<CloudView> parseFromCloudApp(CloudWebApp app) {
		throw new UnsupportedOperationException("Not yet implemented. Need some HTTP download code first.");
	}
}
