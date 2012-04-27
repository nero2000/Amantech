package com.cloudappstudio.activities;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.adapters.ColumnValueListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.ColumnValue;

/**
 * Simple activity that list the columns and values for a specific entry in the database (form entries)
 * @author mrjanek <Jesper Lindberg>
 */
public class EntryDetailsActivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.entry_details_view);
		getSupportActionBar().setTitle("EntryDetails");
		
		List<ColumnValue> sampleData = new ArrayList<ColumnValue>();
		sampleData.add(new ColumnValue("COLUMNNAME", "Value 1"));
		sampleData.add(new ColumnValue("COLUMNNAME", "Value 2"));
		sampleData.add(new ColumnValue("COLUMNNAME", "Value 3"));
		sampleData.add(new ColumnValue("COLUMNNAME", "Value 4"));
		sampleData.add(new ColumnValue("COLUMNNAME", "Value 5"));
		
		ListView listView = (ListView) findViewById(R.id.entry_details_listView);
		listView.setAdapter(new ColumnValueListAdapter(getApplicationContext(), sampleData));
	}
}
