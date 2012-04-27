package com.cloudappstudio.activities;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.adapters.PlainListAdapter;
import com.cloudappstudio.android.R;

/**
 * Shows a list of entries for a specific form
 * @author mrjanek <Jesper Lindberg>
 */
public class FormEntriesActivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.form_entries_view);
		getSupportActionBar().setTitle("FormName");
		
		List<String> sampleData = new ArrayList<String>();
		sampleData.add("Entry 1");
		sampleData.add("Entry 2");
		sampleData.add("Entry 3");
		sampleData.add("Entry 4");
		sampleData.add("Entry 5");
		
		ListView listView = (ListView) findViewById(R.id.form_entries_listView);
		listView.setAdapter(new PlainListAdapter(getApplicationContext(), sampleData));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(getApplicationContext(), EntryDetailsActivity.class);
				startActivity(intent);
			}
		});
	}
}
