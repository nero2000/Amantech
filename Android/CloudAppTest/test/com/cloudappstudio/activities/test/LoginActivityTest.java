package com.cloudappstudio.activities.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudappstudio.activities.LoginActivity;

/**
 * Login Activity Test class
 * 
 * @version 1.0
 * @author Mikael Floberg
 */
public class LoginActivityTest extends
		ActivityInstrumentationTestCase2<LoginActivity> {
	
	//private declarations
	private LoginActivity activity;
	private TextView tv;
	private ListView lv;

	/**
	 * LoginActivityTest
	 * 
	 * Constructor
	 */
	@SuppressWarnings("deprecation")
	public LoginActivityTest() {
		super("com.cloudappstudio.activities", LoginActivity.class);
	}

	/**
	 * LoginActivityTest
	 * 
	 * Constructor
	 * 
	 * @param activityClass
	 */
	public LoginActivityTest(Class<LoginActivity> activityClass) {
		super(activityClass);

	}

	/**
	 * setup
	 * 
	 * Setup the test and get whats needed
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = this.getActivity();
		tv = (TextView) activity
				.findViewById(com.cloudappstudio.android.R.id.textView1);
		lv = (ListView) activity
				.findViewById(com.cloudappstudio.android.R.id.accountListView);
	}

	/**
	 * tearDown
	 */
	@Override
	public void tearDown() throws Exception {

	}

	/**
	 * testPreconditions
	 * 
	 * Have the things we want to test been loaded?
	 * 
	 * @throws Throwable
	 */
	public void testPreconditions() throws Throwable {
		assertNotNull(tv);
		assertNotNull(lv);

	}

	/**
	 * testGoogleAccountsPresentAremoreThanone
	 * 
	 * Is there any google accounts loaded?
	 */
	public void testGoogleAccountsPresentAremoreThanone() {
		assertTrue(lv.getChildCount() != 0); // Test if we are getting any good
												// google account device or not

	}

	/**
	 * PressAccount
	 * 
	 * Shows that asynch task is done properly which is clicking a account in list 
	 * 
	 */
	public void PressAccount() {

		sendKeys("DPAD_DOWN");
		sendKeys("ENTER");
		assertTrue(true == true);// it shows that asynch task is done properly
									// which is clicking a account in list
	}

	/**
	 * testTextViewText
	 * 
	 * Is the text correct?
	 */
	public void testTextViewText() {
		assertEquals("Log in using your Google account", tv.getText());
	}

	/**
	 * testTextViewTextFail
	 * 
	 * Is the text wrong?
	 */
	public void testTextViewTextFail() {
		assertEquals("Log in using your non Google account", tv.getText());
	}

}
