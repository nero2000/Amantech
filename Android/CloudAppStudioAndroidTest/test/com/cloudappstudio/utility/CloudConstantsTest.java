package com.cloudappstudio.utility;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CloudConstantsTest</code> contains tests for the class <code>{@link CloudConstants}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudConstantsTest {
	/**
	 * Run the CloudConstants() constructor test.
	 *
	 */
	@Test
	public void testCloudConstants()
		throws Exception {
		CloudConstants result = new CloudConstants();
		assertNotNull(result);		
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
		new org.junit.runner.JUnitCore().run(CloudConstantsTest.class);
	}
}