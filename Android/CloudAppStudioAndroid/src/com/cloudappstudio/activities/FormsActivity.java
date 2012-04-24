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
 * Shows a list of forms available for a specific web application
 * @author mrjanek <Jesper Lindberg>
 */
public class FormsActivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.forms_view);
		getSupportActionBar().setTitle("ApplicationName");
		
		List<String> sampleData = new ArrayList<String>();
		sampleData.add("Form 1");
		sampleData.add("Form 2");
		sampleData.add("Form 3");
		sampleData.add("Form 4");
		sampleData.add("Form 5");
		
		ListView listView = (ListView) findViewById(R.id.forms_listView);
		listView.setAdapter(new PlainListAdapter(getApplicationContext(), sampleData));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(getApplicationContext(), FormEntriesActivity.class);
				startActivity(intent);
			}
		});
	}
}
