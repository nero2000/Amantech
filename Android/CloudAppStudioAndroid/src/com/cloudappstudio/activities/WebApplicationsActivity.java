package com.cloudappstudio.activities;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import com.cloudappstudio.adapters.PlainListAdapter;
import com.cloudappstudio.android.R;

/**
 * Shows a list of applications associated with a specific Google account
 * @author mrjanek <Jesper Lindberg>
 */
public class WebApplicationsActivity extends SherlockActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.web_applications_view);
		List<String> sampleData = new ArrayList<String>();
		sampleData.add("Application 1");
		sampleData.add("Application 2");
		sampleData.add("Application 3");
		sampleData.add("Application 4");
		sampleData.add("Application 5");
		
		ListView listView = (ListView) findViewById(R.id.webApplications_listView);
		listView.setAdapter(new PlainListAdapter(getApplicationContext(), sampleData));
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(getApplicationContext(), FormsActivity.class);
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
				return true;
			}
		});
        
        return true;
    }
}
