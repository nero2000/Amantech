package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CloudViewTest</code> contains tests for the class <code>{@link CloudView}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewTest {


	/**
	 * Run the CloudView(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudView()
		throws Exception {
		String title = "";
		String viewName = "";

		CloudView result = new CloudView(title, viewName);

		
		assertNotNull(result);
		assertEquals("", result.getTitle());
		assertEquals("", result.getViewName());
		assertEquals(0, result.describeContents());
	}

	/**
	 * Run the int describeContents() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testDescribeContents()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	/**
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTitle()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		String result = fixture.getTitle();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getViewName() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetViewName()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		String result = fixture.getViewName();

		
		assertEquals("", result);
	}


	/**
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetTitle()
		throws Exception {
		CloudView fixture = new CloudView("", "");
		String title = "";

		fixture.setTitle(title);

		
	}

	/**
	 * Run the void setViewName(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetViewName()
		throws Exception {
		CloudView fixture = new CloudView("", "");
		String viewName = "";

		fixture.setViewName(viewName);

		
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
		new org.junit.runner.JUnitCore().run(CloudViewTest.class);
	}
}