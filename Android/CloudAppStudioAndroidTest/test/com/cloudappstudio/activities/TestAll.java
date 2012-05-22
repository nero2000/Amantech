package com.cloudappstudio.activities;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	WebApplicationsActivityTest.class,
	EntryDetailsActivityTest.class,
	ViewEntriesActivityTest.class,
	ViewsActivityTest.class,
	LoginActivityTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
