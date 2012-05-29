package com.cloudappstudio.activities;

import java.util.List;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.adapters.ColumnValueListAdapter;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudViewEntry;
import com.cloudappstudio.data.ColumnValue;
import com.cloudappstudio.utility.ImageLoaderView;

/**
 * Simple activity that list the columns and values for a specific entry in the database (form entries)
 * @author mrjanek <Jesper Lindberg>
 */
public class EntryDetailsActivity extends SherlockActivity {
	private CloudViewEntry viewEntry;
	private LinearLayout scrollViewLayout;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.entry_details_view);
		scrollViewLayout = (LinearLayout) findViewById(R.id.scrollView_layout);
		
		Bundle bundle = getIntent().getExtras();
		viewEntry = bundle.getParcelable("viewEntry");
		
		getSupportActionBar().setTitle("Entry details");

		List<ColumnValue> entries = viewEntry.getColumnValues();		
		List<ColumnValue> images = viewEntry.getImageUrls();
		
		for (ColumnValue columnValue : images) {
			createImage(columnValue.getValue());
			entries.remove(columnValue);
		}
		
		ListView listView = (ListView) findViewById(R.id.entry_details_listView);
		listView.setAdapter(new ColumnValueListAdapter(this, entries));
	}
	
	public void createImage(String imageUrl) {
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);

		int widthPixels = metrics.widthPixels;
		int heightPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, getResources().getDisplayMetrics());
		
		ImageLoaderView imageView = new ImageLoaderView(getApplicationContext(), imageUrl);
		imageView.setLayoutParams(new LayoutParams(widthPixels, heightPixels));
		scrollViewLayout.addView(imageView);
	}

}
