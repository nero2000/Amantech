package com.cloudappstudio.activities;

import java.awt.MenuItem;

import org.junit.*;
import static org.junit.Assert.*;
import com.actionbarsherlock.internal.view.menu.ActionMenu;
import com.actionbarsherlock.view.Menu;
import android.os.Bundle;
import android.content.Context;


public class WebApplicationsActivityTest {
	
	public void testWebApplicationsActivity()
		throws Exception {
		WebApplicationsActivity result = new WebApplicationsActivity();
		assertNotNull(result);
		
	}

	
	public void testOnCreate()
		throws Exception {
		WebApplicationsActivity fixture = new WebApplicationsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);
	}

	public void testOnCreateOptionsMenu()
		throws Exception {
		WebApplicationsActivity fixture = new WebApplicationsActivity();
		MenuItem menu = new MenuItem();

		boolean result = fixture.equals(menu);
		assertTrue(result);
	}

	public void setUp()
		throws Exception {
		
	}

	public void tearDown()
		throws Exception {
		
	}

		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebApplicationsActivityTest.class);
	}
}