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


public class PlainListAdapterTest {
	
	public void testPlainListAdapter()
		throws Exception {
		EntryDetailsActivity context = new EntryDetailsActivity();
		List<String> items = new ArrayList<String>();

		PlainListAdapter result = new PlainListAdapter(context, items);

			assertNotNull(result);
	}

	
	public void testGetCount()
		throws Exception {
		PlainListAdapter fixture = new PlainListAdapter(new EntryDetailsActivity(), new ArrayList<String>());

		int result = fixture.getCount();

		assertEquals(0, result);
	}

	
	public void testGetItem()
		throws Exception {
		PlainListAdapter fixture = new PlainListAdapter(new EntryDetailsActivity(), new ArrayList<String>());
		int position = 1;

		String result = fixture.getItem(position);
		assertNotNull(result);
	}

	public void testGetItemId()
		throws Exception {
		PlainListAdapter fixture = new PlainListAdapter(new EntryDetailsActivity(), new ArrayList<String>());
		int position = 1;

		long result = fixture.getItemId(position);

		assertEquals(0L, result);
	}

	public void testGetView_1()
		throws Exception {
		PlainListAdapter fixture = new PlainListAdapter(new EntryDetailsActivity(), new ArrayList<String>());
		int position = 1;
		EntryDetailsActivity convertView = new EntryDetailsActivity();
		NineHorizontalScrollView parent = new NineHorizontalScrollView();

			assertNotNull(parent);
	}

	public void testGetView_2()
		throws Exception {
		PlainListAdapter fixture = new PlainListAdapter(new EntryDetailsActivity(), new ArrayList<String>());
		int position = 1;
		View convertView = null;
	}
	public void setUp()
		throws Exception {
	}

	
	public void tearDown()
		throws Exception {
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PlainListAdapterTest.class);
	}
}