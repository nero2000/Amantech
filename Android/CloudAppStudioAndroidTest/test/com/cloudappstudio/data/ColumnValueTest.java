package com.cloudappstudio.data;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ColumnValueTest</code> contains tests for the class <code>{@link ColumnValue}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ColumnValueTest {


	/**
	 * Run the ColumnValue(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
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

	/**
	 * Run the boolean IsImageUrl() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsImageUrl_1()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		boolean result = fixture.IsImageUrl();

		
		assertEquals(false, result);
	}

	/**
	 * Run the boolean IsImageUrl() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsImageUrl_2()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		boolean result = fixture.IsImageUrl();

		
		assertEquals(false, result);
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
		ColumnValue fixture = new ColumnValue("", "");

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	/**
	 * Run the String getColumn() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetColumn()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		String result = fixture.getColumn();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetValue()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");

		String result = fixture.getValue();

		
		assertEquals("", result);
	}



	/**
	 * Run the void setColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetColumn()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");
		String volumn = "";

		fixture.setColumn(volumn);

		
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetValue()
		throws Exception {
		ColumnValue fixture = new ColumnValue("", "");
		String value = "";

		fixture.setValue(value);

		
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
		new org.junit.runner.JUnitCore().run(ColumnValueTest.class);
	}
}