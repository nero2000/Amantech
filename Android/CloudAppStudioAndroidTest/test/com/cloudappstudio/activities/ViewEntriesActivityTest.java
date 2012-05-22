package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;

/**
 * The class <code>ViewEntriesActivityTest</code> contains tests for the class <code>{@link ViewEntriesActivity}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ViewEntriesActivityTest {
	/**
	 * Run the ViewEntriesActivity() constructor test.
	 *
	 */
	@Test
	public void testViewEntriesActivity()
		throws Exception {
		ViewEntriesActivity result = new ViewEntriesActivity();
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
		ViewEntriesActivity fixture = new ViewEntriesActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.ViewEntriesActivity.<init>(ViewEntriesActivity.java:32)
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
		new org.junit.runner.JUnitCore().run(ViewEntriesActivityTest.class);
	}
}