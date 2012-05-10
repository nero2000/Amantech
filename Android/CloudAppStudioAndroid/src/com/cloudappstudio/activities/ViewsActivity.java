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
import com.cloudappstudio.adapters.ViewsListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudView;
import com.cloudappstudio.data.CloudWebApp;
import com.cloudappstudio.utility.CloudViewParser;

/**
 * Shows a list of views available for a specific web application
 * @author mrjanek <Jesper Lindberg>
 */
public class ViewsActivity extends SherlockActivity {
	private CloudAuthId id;
	private CloudWebApp app;
	private ProgressDialog progressDialog;
	private ViewsListAdapter listAdapter;
	private List<CloudView> views = new ArrayList<CloudView>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.views_view);
		
		Bundle bundle = getIntent().getExtras();
		id = bundle.getParcelable("id");
		app = bundle.getParcelable("app");
		
		getSupportActionBar().setTitle(app.getTitle());
		
		new ViewsTask().execute(0);

		ListView listView = (ListView) findViewById(R.id.forms_listView);
		listAdapter = new ViewsListAdapter(getApplicationContext(), views);
		listView.setAdapter(listAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long ident) {
				Intent intent = new Intent(getApplicationContext(), ViewEntriesActivity.class);
				
				intent.putExtra("id", id);
				intent.putExtra("app", app);
				intent.putExtra("view", views.get(position));
				
				startActivity(intent);
			}
		});
	}
	
	public class ViewsTask extends AsyncTask<Integer, Integer, Integer> {
		
		@Override
		protected void onPreExecute() {
			progressDialog = ProgressDialog.show(ViewsActivity.this, "Downloading", "Grabbing a list of available views..");
		}
		
		@Override
		protected Integer doInBackground(Integer... params) {
			CloudViewParser parser = new CloudViewParser(id);
			
			try {
				views = parser.parseFromCloud(app.getAppName());
			} 
			
			catch (IllegalStateException e) {
				// todo error handling/reporting
				return -1;
			} 
			catch (IOException e) {
				// todo error handling/reporting
				return -1;		
			} 
			catch (JSONException e) {
				// todo error handling/reporting
				return -1;
			}
			
			return 0;
		}

		@Override
		protected void onPostExecute(Integer param) {
			progressDialog.dismiss();
			
			if (param == 0) {
				listAdapter.setItems(views);
			}
			
			else {
				Toast.makeText(getApplicationContext(), "Failed to download application information", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
