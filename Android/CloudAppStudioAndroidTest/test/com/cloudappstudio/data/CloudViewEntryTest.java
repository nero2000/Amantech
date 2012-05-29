package com.cloudappstudio.data;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
public class CloudViewEntryTest {

	public void testCloudViewEntry()
		throws Exception {
		List<ColumnValue> values = new ArrayList<ColumnValue>();

		CloudViewEntry result = new CloudViewEntry(values);

		
		assertNotNull(result);
		assertEquals(0, result.describeContents());
	}

	public void testDescribeContents()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		int result = fixture.describeContents();

		
		assertEquals(0, result);
	}

	public void testGetColumnValues()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getColumnValues();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	public void testGetImageUrls_1()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	public void testGetImageUrls_2()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	public void testGetImageUrls_3()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());

		List<ColumnValue> result = fixture.getImageUrls();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}


	public void testGetValueByColumnName_1()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}

	public void testGetValueByColumnName_2()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}

	public void testGetValueByColumnName_3()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		String column = "";

		String result = fixture.getValueByColumnName(column);

		
		assertEquals("", result);
	}


	public void testSetColumnValues()
		throws Exception {
		CloudViewEntry fixture = new CloudViewEntry(new ArrayList<ColumnValue>());
		List<ColumnValue> columnValues = new ArrayList<ColumnValue>();

		fixture.setColumnValues(columnValues);

		
	}


	public void setUp()
		throws Exception {
		
	}
	public void tearDown()
		throws Exception {
		
	}
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CloudViewEntryTest.class);
	}
}