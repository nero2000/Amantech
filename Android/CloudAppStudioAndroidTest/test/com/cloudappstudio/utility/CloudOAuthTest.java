package com.cloudappstudio.utility;

import java.util.HashMap;
import java.util.Map;
import android.app.Activity;
import org.junit.*;
import android.accounts.Account;
import static org.junit.Assert.*;
import com.cloudappstudio.data.CloudAuthId;
import android.os.Parcel;

/**
 * The class <code>CloudOAuthTest</code> contains tests for the class <code>{@link CloudOAuth}</code>.
 *
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudOAuthTest {
	/**
	 * Run the CloudOAuth(CloudAuthId) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudOAuth_1()
		throws Exception {
		CloudAuthId id = new CloudAuthId(Parcel.obtain());

		CloudOAuth result = new CloudOAuth(id);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the CloudOAuth(Account,Activity) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudOAuth_2()
		throws Exception {
		Account account = new Account(Parcel.obtain());
		Activity activity = new Activity();

		CloudOAuth result = new CloudOAuth(account, activity);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the CloudOAuth(Account,Activity) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudOAuth_3()
		throws Exception {
		Account account = new Account(Parcel.obtain());
		Activity activity = new Activity();

		CloudOAuth result = new CloudOAuth(account, activity);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the CloudOAuth(Account,Activity) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudOAuth_4()
		throws Exception {
		Account account = new Account(Parcel.obtain());
		Activity activity = new Activity();

		CloudOAuth result = new CloudOAuth(account, activity);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the CloudOAuth(Account,Activity) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testCloudOAuth_5()
		throws Exception {
		Account account = new Account(Parcel.obtain());
		Activity activity = new Activity();

		CloudOAuth result = new CloudOAuth(account, activity);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the CloudAuthId getCloudAuthId() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetCloudAuthId()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));

		CloudAuthId result = fixture.getCloudAuthId();

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_1()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";

		String result = fixture.getContent(apiUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_2()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";

		String result = fixture.getContent(apiUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_3()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";

		String result = fixture.getContent(apiUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_4()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";

		String result = fixture.getContent(apiUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_5()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";

		String result = fixture.getContent(apiUrl);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_6()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";
		Map<String, String> params = new HashMap<String, String>();

		String result = fixture.getContent(apiUrl, params);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_7()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";
		Map<String, String> params = new HashMap<String, String>();

		String result = fixture.getContent(apiUrl, params);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_8()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";
		Map<String, String> params = new HashMap<String, String>();

		String result = fixture.getContent(apiUrl, params);

		
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_9()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";
		Map<String, String> params = new HashMap<String, String>();

		String result = fixture.getContent(apiUrl, params);

	
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.os.Parcel.obtain(Parcel.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the String getContent(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetContent_10()
		throws Exception {
		CloudOAuth fixture = new CloudOAuth(new CloudAuthId(Parcel.obtain()));
		String apiUrl = "";
		Map<String, String> params = new HashMap<String, String>();

		String result = fixture.getContent(apiUrl, params);

		
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
		new org.junit.runner.JUnitCore().run(CloudOAuthTest.class);
	}
}