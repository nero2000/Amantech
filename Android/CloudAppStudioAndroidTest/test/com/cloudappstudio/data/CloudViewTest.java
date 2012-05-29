package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;
public class CloudViewTest {

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

	public void testDescribeContents()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	public void testGetTitle()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		String result = fixture.getTitle();

		
		assertEquals("", result);
	}

	public void testGetViewName()
		throws Exception {
		CloudView fixture = new CloudView("", "");

		String result = fixture.getViewName();

		
		assertEquals("", result);
	}


	public void testSetTitle()
		throws Exception {
		CloudView fixture = new CloudView("", "");
		String title = "";

		fixture.setTitle(title);

		
	}
	public void testSetViewName()
		throws Exception {
		CloudView fixture = new CloudView("", "");
		String viewName = "";

		fixture.setViewName(viewName);

		
	}



	public void setUp()
		throws Exception {
	}
	public void tearDown()
		throws Exception {
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CloudViewTest.class);
	}
}