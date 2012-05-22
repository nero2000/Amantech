package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;

/**
 * The class <code>EntryDetailsActivityTest</code> contains tests for the class <code>{@link EntryDetailsActivity}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class EntryDetailsActivityTest {
	/**
	 * Run the void createImage(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCreateImage()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
		String imageUrl = "";

		fixture.createImage(imageUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
	}

	/**
	 * Run the void onCreate(Bundle) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testOnCreate_1()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
	}

	/**
	 * Run the void onCreate(Bundle) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testOnCreate_2()
		throws Exception {
		EntryDetailsActivity fixture = new EntryDetailsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 */
	@Before
	public void setUp()
		throws Exception {
		
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 */
	@After
	public void tearDown()
		throws Exception {
		
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EntryDetailsActivityTest.class);
	}
}