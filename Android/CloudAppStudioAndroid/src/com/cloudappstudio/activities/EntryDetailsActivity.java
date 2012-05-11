package com.cloudappstudio.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.adapters.ColumnValueListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudViewEntry;

/**
 * Simple activity that list the columns and values for a specific entry in the database (form entries)
 * @author mrjanek <Jesper Lindberg>
 */
public class EntryDetailsActivity extends SherlockActivity {
	private CloudViewEntry viewEntry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.entry_details_view);
		
		Bundle bundle = getIntent().getExtras();
		viewEntry = bundle.getParcelable("viewEntry");
		
		getSupportActionBar().setTitle("Entry details");
		
		ListView listView = (ListView) findViewById(R.id.entry_details_listView);
		listView.setAdapter(new ColumnValueListAdapter(this, viewEntry.getColumnValues()));
	}
}
