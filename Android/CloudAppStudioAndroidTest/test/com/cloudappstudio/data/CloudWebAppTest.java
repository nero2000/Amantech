package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CloudWebAppTest</code> contains tests for the class <code>{@link CloudWebApp}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudWebAppTest {


	/**
	 * Run the CloudWebApp(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudWebApp()
		throws Exception {
		String title = "";
		String description = "";
		String appName = "Cloud App Studio";

		CloudWebApp result = new CloudWebApp(title, description, appName);

		
		assertNotNull(result);
		assertEquals("Cloud App Studio", result.getAppName());
		assertEquals("", result.getTitle());
		assertEquals("", result.getDescription());
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
		CloudWebApp fixture = new CloudWebApp("", "", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	/**
	 * Run the String getAppName() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetAppName()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getAppName();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetDescription()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getDescription();

		
		assertEquals("", result);
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
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getTitle();

		
		assertEquals("", result);
	}


	/**
	 * Run the void setAppName(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetAppName()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String appName = "";

		fixture.setAppName(appName);

		
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetDescription()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String description = "";

		fixture.setDescription(description);

		
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
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String title = "";

		fixture.setTitle(title);

		
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
		new org.junit.runner.JUnitCore().run(CloudWebAppTest.class);
	}
}