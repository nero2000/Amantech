package com.cloudappstudio.activities.test;

import com.cloudappstudio.activities.ViewsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class ViewsActivityTest extends     ActivityInstrumentationTestCase2<ViewsActivity> {

	ViewsActivity activity;
TextView tv;


@SuppressWarnings("deprecation")
public ViewsActivityTest() {
	super("com.cloudappstudio.activities", ViewsActivity.class);
}

public ViewsActivityTest(Class<ViewsActivity> activityClass) {
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
	assertEquals("Views available for application", tv.getText());
}

public void testTextViewTextFail() {
	assertEquals("Views not available for application", tv.getText());
}



}
