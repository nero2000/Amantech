package com.cloudappstudio.utility;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cloudappstudio.data.CloudWebApp;

/**
 * CloudWebAppParser - Parses web application information into CloudWebApp objects
 * @author mrjanek <Jesper Lindberg>
 */
public class CloudWebAppParser {
	private static final String apiUrl = "https://cloudappstudio360.appspot.com/api/json/v2/apps.json";
	private static final String sampleJson = "[{id:'e9ea0f55-de88-42fe-a8d9-33333e6e95a9',title:'CAS Android',themeId:'cas_theme1',description:'',name:'lSHbx5Nj',links:{scripts:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/scripts.json?appName=lSHbx5Nj'},views:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/views.json?appName=lSHbx5Nj'},pages:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/pages.json?appName=lSHbx5Nj'},themes:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/themes.json?appName=lSHbx5Nj'},forms:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/forms.json?appName=lSHbx5Nj'}},createdDate:1334903646210},{id:'d73f4820-7d4b-4bd7-8822-70d9aaad8a20',title:'DEMO Frank',themeId:'d579d787-37f1-4f2b-af5d-2a354045dd4f',description:'',name:'vf4lsL3K',links:{scripts:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/scripts.json?appName=vf4lsL3K'},views:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/views.json?appName=vf4lsL3K'},pages:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/pages.json?appName=vf4lsL3K'},themes:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/themes.json?appName=vf4lsL3K'},forms:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/forms.json?appName=vf4lsL3K'}},createdDate:1331122567205},{id:'806172be-1b31-440a-9df1-155a6f1271cd',title:'HGO',themeId:'07312a87-b726-4201-9d8d-66b31d5ea6d2',description:'',name:'8eMpxmRs',links:{scripts:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/scripts.json?appName=8eMpxmRs'},views:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/views.json?appName=8eMpxmRs'},pages:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/pages.json?appName=8eMpxmRs'},themes:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/themes.json?appName=8eMpxmRs'},forms:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/forms.json?appName=8eMpxmRs'}},createdDate:1333013419777},{id:'4c3bdce5-55bd-41b1-9f63-308a9d6a2174',title:'mittNyaHem',themeId:'5b3b5dfe-6a05-4600-9175-de4b3676fb55',description:'',name:'zzxeNYK0',links:{scripts:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/scripts.json?appName=zzxeNYK0'},views:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/views.json?appName=zzxeNYK0'},pages:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/pages.json?appName=zzxeNYK0'},themes:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/themes.json?appName=zzxeNYK0'},forms:{method:'GET',url:'https://cloudappstudio360.appspot.com:443/api/json/v2/forms.json?appName=zzxeNYK0'}},createdDate:1334081245029}]";

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
	
	public List<CloudWebApp> parseFromCloud() {
		throw new UnsupportedOperationException("Not yet implemented. Need some HTTP download code first.");
	}
}
