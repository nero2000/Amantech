package com.cloudappstudio.utility;

import static org.junit.Assert.*;

public class CloudConstantsTest {
	public void testCloudConstants()
		throws Exception {
		CloudConstants result = new CloudConstants();
		assertNotNull(result);		
	}
	public void setUp()
		throws Exception {		
	}
	public void tearDown()
		throws Exception {		
	}
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CloudConstantsTest.class);
	}
}