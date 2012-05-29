package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;


public class ViewsActivityTest {
	
	public void testViewsActivity()
		throws Exception {
		ViewsActivity result = new ViewsActivity();
		assertNotNull(result);
		
	}

	public void testOnCreate()
		throws Exception {
		ViewsActivity fixture = new ViewsActivity();
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
		new org.junit.runner.JUnitCore().run(ViewsActivityTest.class);
	}
}