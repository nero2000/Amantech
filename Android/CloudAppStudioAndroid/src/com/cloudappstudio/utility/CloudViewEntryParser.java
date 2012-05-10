package com.cloudappstudio.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudViewEntry;
import com.cloudappstudio.data.ColumnValue;

/**
 * CloudViewEntriesParser - Parses entries for a specific view and encapsulates the data in CloudViewEntry objects for convenience
 * @author mrjanek <Jesper Lindberg>
 */
public class CloudViewEntryParser {
	private CloudAuthId id;
	
	public CloudViewEntryParser(CloudAuthId id) {
		this.id = id;
	}
	
	public List<CloudViewEntry> parseFromString(String json) throws JSONException {
		JSONArray outlineArray = new JSONArray(json);
		List<CloudViewEntry> views = new ArrayList<CloudViewEntry>();
		
		for (int i = 0; i < outlineArray.length(); i++) {
			JSONObject appObject = outlineArray.getJSONObject(i);
			
			JSONArray columnsJson = appObject.getJSONArray("columns");
			final String[] columns = new String[columnsJson.length()];
			
			for (int j = 0; j < columns.length; j++) {
				columns[j] = columnsJson.getString(j);
			}
			
			JSONArray rowsJson = appObject.getJSONArray("rows");
			for (int j = 0; j < rowsJson.length(); j++) {
				JSONObject rowObject = rowsJson.getJSONObject(j);
				JSONArray valuesJson = rowObject.getJSONArray("columns");
				
				List<ColumnValue> viewEntries = new ArrayList<ColumnValue>();
				
				final String[] values = new String[valuesJson.length()];
				
				for (int x = 0; x < valuesJson.length(); x++) {
					values[x] = valuesJson.getString(x);
				}
				
				for (int k = 0; k < values.length; k++) {
					if (columns.length <= values.length)
						viewEntries.add(new ColumnValue(columns[k], values[k]));
				}
				
				views.add(new CloudViewEntry(viewEntries));
			}
		}
		
		return views;
	}
	
	public List<CloudViewEntry> parseFromCloud(String appName, String viewName) throws IllegalStateException, IOException, JSONException {
		CloudOAuth auth = new CloudOAuth(id);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("&appName=", appName);
		params.put("&viewName=", viewName);
		
		String content = auth.getContent(CloudConstants.CAS360_VIEWDATA_JSON, params);
		return parseFromString(content);
	}
}
