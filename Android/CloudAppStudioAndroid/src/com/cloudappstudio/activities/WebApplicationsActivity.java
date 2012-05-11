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
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import com.cloudappstudio.adapters.WebApplicationsListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudWebApp;
import com.cloudappstudio.utility.CloudWebAppParser;

/**
 * Shows a list of applications associated with a specific Google account
 * @author mrjanek <Jesper Lindberg>
 */
public class WebApplicationsActivity extends SherlockActivity {
	private CloudAuthId id;
	private List<CloudWebApp> webApps = new ArrayList<CloudWebApp>();
	private ProgressDialog progressDialog;
	private WebApplicationsListAdapter listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.web_applications_view);
		
		Bundle bundle = getIntent().getExtras();
		id = bundle.getParcelable("id");
		
		new WebApplicationsTask().execute(0);

		ListView listView = (ListView) findViewById(R.id.webApplications_listView);
		listAdapter = new WebApplicationsListAdapter(getApplicationContext(), webApps);
		listView.setAdapter(listAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long ident) {
				CloudWebApp app = webApps.get(position);
				
				Intent intent = new Intent(getApplicationContext(), ViewsActivity.class);
				intent.putExtra("id", id);
				intent.putExtra("app", app);

				startActivity(intent);
			}
		});
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.layout.actionbar_menu, menu);
        
        MenuItem item = menu.findItem(R.id.menu_add);
        item.setOnMenuItemClickListener(new OnMenuItemClickListener() {			

			public boolean onMenuItemClick(MenuItem item) {
				new WebApplicationsTask().execute(0);
				return true;
			}
		});
        
        return true;
    }
    

	public class WebApplicationsTask extends AsyncTask<Integer, Integer, Integer> {
		
		@Override
		protected void onPreExecute() {
			progressDialog = ProgressDialog.show(WebApplicationsActivity.this, "Downloading", "Fetching a list of available applications..");
		}
		
		@Override
		protected Integer doInBackground(Integer... params) {
			CloudWebAppParser parser = new CloudWebAppParser(id);
			
			try {
				webApps = parser.parseFromCloud();
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
				listAdapter.setItems(webApps);
			}
			
			else {
				Toast.makeText(getApplicationContext(), "Failed to download application information", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
