package com.cloudappstudio.activities.test;

import android.test.ActivityInstrumentationTestCase2;
import com.cloudappstudio.activities.EntryDetailsActivity;

public class EntryDetailsActivityTest extends
		ActivityInstrumentationTestCase2<EntryDetailsActivity> {

	EntryDetailsActivity activity;
	CharSequence text;

	@SuppressWarnings("deprecation")
	public EntryDetailsActivityTest() {
		super("com.cloudappstudio.activities", EntryDetailsActivity.class);
	}

	public EntryDetailsActivityTest(Class<EntryDetailsActivity> activityClass) {
		super(activityClass);

	}
	
	 @Override
	 protected void setUp() throws Exception {
	 super.setUp();
	 activity = this.getActivity();
	 text = activity.getSupportActionBar().getTitle();
	
	 }
	
	 public void tearDown() throws Exception {
	
	 }
	
	 public void testPreconditions() throws Throwable {
	 }
	
	 public void testTextBarText() {
	 System.out.println(text);
	 assertEquals("Entry details", text);
	 }
	
	 public void testTextBarTextFail() {
	 assertEquals("Not Entry detailst", text);
	 }
}
