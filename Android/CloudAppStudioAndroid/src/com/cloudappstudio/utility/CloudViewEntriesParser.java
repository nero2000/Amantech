package com.cloudappstudio.utility;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cloudappstudio.data.CloudView;
import com.cloudappstudio.data.CloudViewEntry;

/**
 * CloudViewEntriesParser - Parses entries for a specific view and encapsulates the data in CloudViewEntry objects for convenience
 * @author mrjanek <Jesper Lindberg>
 */
public class CloudViewEntriesParser {
	private static final String apiUrl = "https://cloudappstudio360.appspot.com/api/json/v2/viewdata?appName=[APP_NAME]&viewName=[VIEW_NAME]";
	private static final String sampleJson = "[{sortOrder:'asc',sortedColumnIndex:0,columns:['Titel','Antal rum','Storlek','Pris','Länk till bild','Länk till mäklaren'],url:'/app/zzxeNYK0/view/eOTQx3t9',rows:[{formName:'KKnTf3EY',columns:['Flen - Nygatan','1','31','80000','http://image.svenskfast.se/imagemod2/ObjectData/40UJUCES6E2MJJRR/40UJUCES6E2MJJRR_412QGQRIDIBAA2BL_____resize_s_800_0.jpg','http://www.svenskfast.se/Templates/ObjectView.aspx?objectid=40UJUCES6E2MJJRR'],url:'/app/zzxeNYK0/form/KKnTf3EY?itemId=36924e3e-aede-4202-bb5a-be88e4f6f69c',dataItemId:'36924e3e-aede-4202-bb5a-be88e4f6f69c'},{formName:'KKnTf3EY',columns:['Skit fint hus','5','100','1000','http://aftonladet.se/bild.gif','http://aftonbladet.se'],url:'/app/zzxeNYK0/form/KKnTf3EY?itemId=95857394-fe3b-4b4e-86fc-e9267995e524',dataItemId:'95857394-fe3b-4b4e-86fc-e9267995e524'},{formName:'KKnTf3EY',columns:['Test','1','25 kvm','2000kr','http://www.ehomedecor.net/wp-content/uploads/2011/08/What-is-an-apartment.jpg','http://www.mkbfastighet.se/'],url:'/app/zzxeNYK0/form/KKnTf3EY?itemId=aca50a4c-3fae-4c64-8885-a3043b888930',dataItemId:'aca50a4c-3fae-4c64-8885-a3043b888930'}]}])";


	public List<CloudViewEntry> parseFromString(String json, String appName, String viewName) throws JSONException {
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
				
				final String[] values = new String[valuesJson.length()];
				
				for (int x = 0; x < valuesJson.length(); x++) {
					values[x] = valuesJson.getString(x);
				}
				
				views.add(new CloudViewEntry(columns, values));
			}
		}
		
		return views;
	}
	
	public List<CloudView> parseFromCloud(String appName, String viewName) {
		throw new UnsupportedOperationException("Not yet implemented. Need some HTTP download code first.");
	}
}
