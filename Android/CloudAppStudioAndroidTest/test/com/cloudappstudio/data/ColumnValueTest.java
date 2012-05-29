package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;
public class ColumnValueTest {

	public void testColumnValue()
		throws Exception {
		String column = "";
		String value = "";

		ColumnValue result = new ColumnValue(column, value);

		
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(0, result.describeContents());
		assertEquals("", result.getColumn());
		assertEquals(false, result.IsImageUrl());
	}

	public void testIsImageUrl_1()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		boolean result = fixture.IsImageUrl();

		
		assertEquals(false, result);
	}

	public void testIsImageUrl_2()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		boolean result = fixture.IsImageUrl();

		
		assertEquals(false, result);
	}

	public void testDescribeContents()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}
	public void testGetColumn()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		String result = fixture.getColumn();

		
		assertEquals("", result);
	}
	public void testGetValue()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		String result = fixture.getValue();

		
		assertEquals("", result);
	}
	public void testSetColumn()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");
		String volumn = "";

		fixture.setColumn(volumn);

		
	}
	public void testSetValue()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");
		String value = "";

		fixture.setValue(value);

		
	}

	public void setUp()
		throws Exception {
		
	}
	public void tearDown()
		throws Exception {
		
	}
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ColumnValueTest.class);
	}
}