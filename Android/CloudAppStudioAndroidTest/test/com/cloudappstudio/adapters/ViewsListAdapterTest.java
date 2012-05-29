package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import android.content.Context;
import android.annotation.*;
import android.content.*;
import android.os.*;
import org.junit.*;
import static org.junit.Assert.*;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView;
import com.cloudappstudio.activities.EntryDetailsActivity;
import com.cloudappstudio.data.CloudView;


public class ViewsListAdapterTest {
	public void testViewsListAdapter()
		throws Exception {
		Context context = new Context();
		List<CloudView> items = new ArrayList<CloudView>();

		ViewsListAdapter result = new ViewsListAdapter(context, items);

		
		assertNotNull(result);
	}
	public void testGetCount()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null, null);

		int result = fixture.getCount();
		assertEquals(0, result);
	}

	public void testGetItem()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null, null);
		int position = 1;

		CloudView result = fixture.getItem(position);

				assertNotNull(result);
	}
	public void testGetItemId()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null,null);
		int position = 1;

		long result = fixture.getItemId(position);
		assertEquals(0L, result);
	}
	public void testGetView_1()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null, null);
		int position = 1;
		
		NineHorizontalScrollView parent = new NineHorizontalScrollView();

		View convertView;
	assertNotNull(parent);
	}

	
	public void testGetView_2()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null,null);
		int position = 1;
		View convertView = null;
		NineHorizontalScrollView parent = new NineHorizontalScrollView();
assertNotNull(parent);
	}

	public void testSetItems()
		throws Exception {
		ViewsListAdapter fixture = new ViewsListAdapter(null,null);
		List<CloudView> items = new ArrayList<CloudView>();

		fixture.setItems(items);
	}

	public void setUp()
		throws Exception {
	
	}
	public void tearDown()
		throws Exception {
		
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ViewsListAdapterTest.class);
	}
}