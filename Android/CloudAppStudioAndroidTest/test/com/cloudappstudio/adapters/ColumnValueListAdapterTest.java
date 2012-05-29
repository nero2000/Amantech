package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import android.content.Context;
import android.os.*;
import android.os.*;
import android.content.*;
import android.annotation.*;
import org.junit.*;
import static org.junit.Assert.*;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView;
import com.cloudappstudio.activities.EntryDetailsActivity;
import com.cloudappstudio.data.ColumnValue;


public class ColumnValueListAdapterTest {
	
	public void testColumnValueListAdapter()
		throws Exception {
		EntryDetailsActivity context = new EntryDetailsActivity();
		List<ColumnValue> items = new ArrayList<ColumnValue>();
		
			assertNotNull(context);
	}

	

	public void testGetCount()
		throws Exception {
		ColumnValueListAdapter fixture = new ColumnValueListAdapter(new EntryDetailsActivity(), new ArrayList<ColumnValue>());

		int result = fixture.getCount();

		assertEquals(0, result);
	}

	public void testGetItem()
		throws Exception {
		ColumnValueListAdapter fixture = new ColumnValueListAdapter(new EntryDetailsActivity(), new ArrayList<ColumnValue>());
		int position = 1;

		ColumnValue result = fixture.getItem(position);

		
		assertNotNull(result);
	}

	public void testGetItemId()
		throws Exception {
		ColumnValueListAdapter fixture = new ColumnValueListAdapter(new EntryDetailsActivity(), new ArrayList<ColumnValue>());
		int position = 1;

		long result = fixture.getItemId(position);
		assertEquals(0L, result);
	}

	public void testGetView_1()
		throws Exception {
		ColumnValueListAdapter fixture = new ColumnValueListAdapter(new EntryDetailsActivity(), new ArrayList<ColumnValue>());
		int position = 1;
		NineHorizontalScrollView parent = new NineHorizontalScrollView();

		
		assertNotNull(parent);
	}

	public void testGetView_2()
		throws Exception {
		ColumnValueListAdapter fixture = new ColumnValueListAdapter(new EntryDetailsActivity(), new ArrayList<ColumnValue>());
		int position = 1;
		View convertView = null;
		NineHorizontalScrollView parent = new NineHorizontalScrollView();

		
		assertNotNull(parent);
	}

	public void setUp()
		throws Exception {
		
	}
	public void tearDown()
		throws Exception {
		
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ColumnValueListAdapterTest.class);
	}
}