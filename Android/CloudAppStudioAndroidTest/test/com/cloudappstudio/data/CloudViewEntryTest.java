package com.cloudappstudio.data;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CloudViewEntryTest</code> contains tests for the class <code>{@link CloudViewEntry}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewEntryTest {


	/**
	 * Run the CloudViewEntry(List<ColumnValue>) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudViewEntry()
		throws Exception {
		List<ColumnValue> values = new ArrayList<ColumnValue>();

		CloudViewEntry result = new CloudViewEntry(values);

		
		assertNotNull(result);
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
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	/**
	 * Run the List<ColumnValue> getColumnValues() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetColumnValues()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getColumnValues();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ColumnValue> getImageUrls() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetImageUrls_1()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ColumnValue> getImageUrls() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetImageUrls_2()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ColumnValue> getImageUrls() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetImageUrls_3()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}


	/**
	 * Run the String getValueByColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetValueByColumnName_1()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}

	/**
	 * Run the String getValueByColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetValueByColumnName_2()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}

	/**
	 * Run the String getValueByColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetValueByColumnName_3()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}


	/**
	 * Run the void setColumnValues(List<ColumnValue>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetColumnValues()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		List<ColumnValue> columnValues = new ArrayList<ColumnValue>();

		fixture.setColumnValues(columnValues);

		
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
		new org.junit.runner.JUnitCore().run(CloudViewEntryTest.class);
	}
}