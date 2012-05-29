package com.cloudappstudio.activities;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	WebApplicationsActivityTest.class,
	EntryDetailsActivityTest.class,
	ViewEntriesActivityTest.class,
	ViewsActivityTest.class,
	LoginActivityTest.class,
})
public class TestAll {

	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
