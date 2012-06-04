package com.cloudappstudio.activities.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.cloudappstudio.activities.WebApplicationsActivity;

/**
 * ViewEntries Activity Test class
 * 
 * @version 1.0
 * @author Mikael Floberg
 */
public class ViewEntriesActivityTest extends
		ActivityInstrumentationTestCase2<WebApplicationsActivity> {

	//private declarations
	private WebApplicationsActivity activity;
	private TextView tv;

	/**
	 * ViewEntriesActivityTest
	 * 
	 * Constructor
	 */
	@SuppressWarnings("deprecation")
	public ViewEntriesActivityTest() {
		super("com.cloudappstudio.activities", WebApplicationsActivity.class);
	}

	/**
	 * ViewEntriesActivityTest
	 * 
	 * Constructor
	 * @param activityClass
	 */
	public ViewEntriesActivityTest(Class<WebApplicationsActivity> activityClass) {
		super(activityClass);

	}

	/**
	 * setUp
	 * 
	 * Setup the test and get whats needed
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = this.getActivity();
		tv = (TextView) activity
				.findViewById(com.cloudappstudio.android.R.id.textView1);

	}

	/**
	 * tearDown
	 */
	public void tearDown() throws Exception {

	}

	/**
	 * testPreconditions
	 * 
	 * Have the things we want to test been loaded?
	 * @throws Throwable
	 */
	public void testPreconditions() throws Throwable {
		assertNotNull(tv);

	}

	/**
	 * testTextViewText
	 * 
	 * Is the text correct?
	 */
	public void testTextViewText() {
		assertEquals("Entries available for view", tv.getText());
	}

	/**
	 * testTextViewTextFail
	 * 
	 * Is the text wrong?
	 */
	public void testTextViewTextFail() {
		assertEquals("Entries Not available for view", tv.getText());
	}
}
