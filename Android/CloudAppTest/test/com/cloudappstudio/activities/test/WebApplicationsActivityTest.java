package com.cloudappstudio.activities.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.cloudappstudio.activities.WebApplicationsActivity;


public class WebApplicationsActivityTest extends ActivityInstrumentationTestCase2<WebApplicationsActivity> {
	
	WebApplicationsActivity activity;
	TextView tv;
		
		
	
	@SuppressWarnings("deprecation")
	public WebApplicationsActivityTest() {
		super("com.cloudappstudio.activities", WebApplicationsActivity.class);
	}

	public WebApplicationsActivityTest(Class<WebApplicationsActivity> activityClass) {
		super(activityClass);

	}


@Override
protected void setUp() throws Exception {
	super.setUp();
	activity = this.getActivity();
	tv = (TextView) activity
			.findViewById(com.cloudappstudio.android.R.id.textView1);

}

public void tearDown() throws Exception {

}

public void testPreconditions() throws Throwable {
	assertNotNull(tv);

}



public void testTextViewText() {
	assertEquals("Your web applications", tv.getText());
}

public void testTextViewTextFail() {
	assertEquals("Not Your web applications", tv.getText());
}
}
