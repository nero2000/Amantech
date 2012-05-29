package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;


public class ViewEntriesActivityTest {
	
	public void testViewEntriesActivity()
		throws Exception {
		ViewEntriesActivity result = new ViewEntriesActivity();
		assertNotNull(result);
		
	}

	
	public void testOnCreate()
		throws Exception {
		ViewEntriesActivity fixture = new ViewEntriesActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);
	}
	
	public void setUp()
		throws Exception {
		
	}

	public void tearDown()
		throws Exception {
		
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ViewEntriesActivityTest.class);
	}
}