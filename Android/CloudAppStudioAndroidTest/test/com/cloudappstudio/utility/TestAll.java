package com.cloudappstudio.utility;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CloudViewParserTest.class,
	CloudOAuthTest.class,
	ImageLoaderViewTest.class,
	CloudWebAppParserTest.class,
	CloudConstantsTest.class,
	CloudViewEntryParserTest.class,
})
public class TestAll {
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
