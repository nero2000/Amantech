package com.cloudappstudio.utility;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.cloudappstudio.data.CloudAuthId;
import android.os.Parcel;
import com.cloudappstudio.data.CloudViewEntry;

/**
 * The class <code>CloudViewEntryParserTest</code> contains tests for the class <code>{@link CloudViewEntryParser}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewEntryParserTest {
	/**
	 * Run the CloudViewEntryParser(CloudAuthId) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudViewEntryParser()
		throws Exception {
		CloudAuthId id = new CloudAuthId(Parcel.obtain());

		CloudViewEntryParser result = new CloudViewEntryParser(id);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromCloud(String,String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromCloud_1()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String appName = "";
		String viewName = "";

		List<CloudViewEntry> result = fixture.parseFromCloud(appName, viewName);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromCloud(String,String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromCloud_2()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String appName = "";
		String viewName = "";

		List<CloudViewEntry> result = fixture.parseFromCloud(appName, viewName);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromCloud(String,String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromCloud_3()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String appName = "";
		String viewName = "";

		List<CloudViewEntry> result = fixture.parseFromCloud(appName, viewName);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromCloud(String,String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromCloud_4()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String appName = "";
		String viewName = "";

		List<CloudViewEntry> result = fixture.parseFromCloud(appName, viewName);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_1()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_2()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_3()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_4()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_5()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

	
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_6()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_7()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_8()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_9()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_10()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_11()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_12()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the List<CloudViewEntry> parseFromString(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testParseFromString_13()
		throws Exception {
		CloudViewEntryParser fixture = new CloudViewEntryParser(new CloudAuthId(Parcel.obtain()));
		String json = "";

		List<CloudViewEntry> result = fixture.parseFromString(json);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
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
		new org.junit.runner.JUnitCore().run(CloudViewEntryParserTest.class);
	}
}