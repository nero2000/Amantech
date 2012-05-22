package com.cloudappstudio.utility;

import org.junit.*;
import static org.junit.Assert.*;
import com.cloudappstudio.activities.EntryDetailsActivity;
import android.content.Context;
import android.util.AttributeSet;

/**
 * The class <code>ImageLoaderViewTest</code> contains tests for the class <code>{@link ImageLoaderView}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ImageLoaderViewTest {
	/**
	 * Run the ImageLoaderView(Context,AttributeSet) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testImageLoaderView_1()
		throws Exception {
		Context context = new EntryDetailsActivity();
		AttributeSet attrSet = null;

		ImageLoaderView result = new ImageLoaderView(context, attrSet);

		
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
	 * Run the ImageLoaderView(Context,AttributeSet) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testImageLoaderView_2()
		throws Exception {
		Context context = new EntryDetailsActivity();
		AttributeSet attrSet = null;

		ImageLoaderView result = new ImageLoaderView(context, attrSet);

		
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
	 * Run the ImageLoaderView(Context,String) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testImageLoaderView_3()
		throws Exception {
		Context context = new EntryDetailsActivity();
		String imageUrl = "";

		ImageLoaderView result = new ImageLoaderView(context, imageUrl);

		
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
	 * Run the void setImageDrawable(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetImageDrawable()
		throws Exception {
		ImageLoaderView fixture = new ImageLoaderView(new EntryDetailsActivity(), (AttributeSet) null);
		String imageUrl = "";

		fixture.setImageDrawable(imageUrl);

		
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
		new org.junit.runner.JUnitCore().run(ImageLoaderViewTest.class);
	}
}