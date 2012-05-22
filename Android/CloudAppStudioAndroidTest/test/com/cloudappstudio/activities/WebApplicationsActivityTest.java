package com.cloudappstudio.activities;

import org.junit.*;
import static org.junit.Assert.*;
import com.actionbarsherlock.internal.view.menu.ActionMenu;
import com.actionbarsherlock.view.Menu;
import android.os.Bundle;
import android.content.Context;

/**
 * The class <code>WebApplicationsActivityTest</code> contains tests for the class <code>{@link WebApplicationsActivity}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class WebApplicationsActivityTest {
	/**
	 * Run the WebApplicationsActivity() constructor test.
	 *
	 */
	@Test
	public void testWebApplicationsActivity()
		throws Exception {
		WebApplicationsActivity result = new WebApplicationsActivity();
		assertNotNull(result);
		
	}

	/**
	 * Run the void onCreate(Bundle) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testOnCreate()
		throws Exception {
		WebApplicationsActivity fixture = new WebApplicationsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.WebApplicationsActivity.<init>(WebApplicationsActivity.java:34)
	}

	/**
	 * Run the boolean onCreateOptionsMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testOnCreateOptionsMenu()
		throws Exception {
		WebApplicationsActivity fixture = new WebApplicationsActivity();
		Menu menu = new ActionMenu(new EntryDetailsActivity());

		boolean result = fixture.onCreateOptionsMenu(menu);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.WebApplicationsActivity.<init>(WebApplicationsActivity.java:34)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(WebApplicationsActivityTest.class);
	}
}