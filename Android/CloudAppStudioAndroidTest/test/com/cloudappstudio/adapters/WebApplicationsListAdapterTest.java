package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import org.junit.*;
import static org.junit.Assert.*;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView;
import com.cloudappstudio.activities.EntryDetailsActivity;
import com.cloudappstudio.data.CloudWebApp;

/**
 * The class <code>WebApplicationsListAdapterTest</code> contains tests for the class <code>{@link WebApplicationsListAdapter}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class WebApplicationsListAdapterTest {
	/**
	 * Run the WebApplicationsListAdapter(Context,List<CloudWebApp>) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testWebApplicationsListAdapter()
		throws Exception {
		Context context = new EntryDetailsActivity();
		List<CloudWebApp> items = new ArrayList<CloudWebApp>();

		WebApplicationsListAdapter result = new WebApplicationsListAdapter(context, items);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the int getCount() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetCount()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());

		int result = fixture.getCount();

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertEquals(0, result);
	}

	/**
	 * Run the CloudWebApp getItem(int) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetItem()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());
		int position = 1;

		CloudWebApp result = fixture.getItem(position);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the long getItemId(int) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetItemId()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());
		int position = 1;

		long result = fixture.getItemId(position);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertEquals(0L, result);
	}

	/**
	 * Run the View getView(int,View,ViewGroup) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetView_1()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());
		int position = 1;
		View convertView = new View(new EntryDetailsActivity());
		ViewGroup parent = new NineHorizontalScrollView(new EntryDetailsActivity());

		View result = fixture.getView(position, convertView, parent);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the View getView(int,View,ViewGroup) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetView_2()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());
		int position = 1;
		View convertView = null;
		ViewGroup parent = new NineHorizontalScrollView(new EntryDetailsActivity());

		View result = fixture.getView(position, convertView, parent);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.actionbarsherlock.app.SherlockActivity.<init>(SherlockActivity.java:21)
		//       at com.cloudappstudio.activities.EntryDetailsActivity.<init>(EntryDetailsActivity.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the void setItems(List<CloudWebApp>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetItems()
		throws Exception {
		WebApplicationsListAdapter fixture = new WebApplicationsListAdapter(new EntryDetailsActivity(), new ArrayList<CloudWebApp>());
		List<CloudWebApp> items = new ArrayList<CloudWebApp>();

		fixture.setItems(items);

		
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
		new org.junit.runner.JUnitCore().run(WebApplicationsListAdapterTest.class);
	}
}