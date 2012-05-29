package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;


public class EntryDetailsActivityTest {
	
	
	public void testCreateImage()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
		String imageUrl = "";

		fixture.createImage(imageUrl);

	}
	
	public void testOnCreate_1()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

	}
	
	public void testOnCreate_2()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
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
		new org.junit.runner.JUnitCore().run(EntryDetailsActivityTest.class);
	}
}