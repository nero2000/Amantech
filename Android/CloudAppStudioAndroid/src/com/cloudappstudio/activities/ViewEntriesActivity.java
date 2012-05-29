package com.cloudappstudio.activities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.adapters.ViewEntriesListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudView;
import com.cloudappstudio.data.CloudViewEntry;
import com.cloudappstudio.data.CloudWebApp;
import com.cloudappstudio.utility.CloudViewEntryParser;

/**
 * Shows a list of entries for a specific form
 * @author mrjanek <Jesper Lindberg>
 */
public class ViewEntriesActivity extends SherlockActivity {
	private CloudAuthId id;
	private CloudWebApp app;
	private CloudView view;
	private ViewEntriesListAdapter listAdapter;
	private ProgressDialog progressDialog;
	private List<CloudViewEntry> viewEntries = new ArrayList<CloudViewEntry>();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.view_entries_view);
		
		Bundle bundle = getIntent().getExtras();
		id = bundle.getParcelable("id");
		app = bundle.getParcelable("app");
		view = bundle.getParcelable("view");
		
		getSupportActionBar().setTitle(view.getTitle());
		
		new ViewEntriesTask().execute(0);
		
		ListView listView = (ListView) findViewById(R.id.form_entries_listView);
		listAdapter = new ViewEntriesListAdapter(getApplicationContext(), viewEntries);
		
		listView.setAdapter(listAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(getApplicationContext(), EntryDetailsActivity.class);
				intent.putExtra("viewEntry", viewEntries.get(position));
				startActivity(intent);
			}
		});
	}
	
	public class ViewEntriesTask extends AsyncTask<Integer, Integer, Integer> {
		
		@Override
		protected void onPreExecute() {
			progressDialog = ProgressDialog.show(ViewEntriesActivity.this, "Downloading", "Fetching a list of available view entries..");
		}
		
		@Override
		protected Integer doInBackground(Integer... params) {
			CloudViewEntryParser parser = new CloudViewEntryParser(id);
			
			try {
				viewEntries = parser.parseFromCloud(app.getAppName(), view.getViewName());
			} 
			
			catch (IllegalStateException e) {
				return -1;
			} 
			catch (IOException e) {
				return -1;		
			} 
			catch (JSONException e) {
				return -1;
			}
			
			return 0;
		}

		@Override
		protected void onPostExecute(Integer param) {
			progressDialog.dismiss();
			
			if (param == 0) {
				listAdapter.setItems(viewEntries);
			}
			
			else {
				Toast.makeText(getApplicationContext(), "Failed to download view entries", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
