package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;
public class CloudWebAppTest {

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

	public void testDescribeContents()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	public void testGetAppName()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getAppName();

		
		assertEquals("", result);
	}

	public void testGetDescription()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getDescription();

		
		assertEquals("", result);
	}

	public void testGetTitle()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");

		String result = fixture.getTitle();

		
		assertEquals("", result);
	}


	public void testSetAppName()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String appName = "";

		fixture.setAppName(appName);

		
	}

	public void testSetDescription()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String description = "";

		fixture.setDescription(description);

		
	}

	public void testSetTitle()
		throws Exception {
		CloudWebApp fixture = new CloudWebApp("", "", "");
		String title = "";

		fixture.setTitle(title);

		
	}

	public void setUp()
		throws Exception {
		
	}
	public void tearDown()
		throws Exception {
		
	}
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CloudWebAppTest.class);
	}
}