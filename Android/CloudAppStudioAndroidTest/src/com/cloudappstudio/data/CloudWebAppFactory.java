package com.cloudappstudio.data;

import android.os.Parcel;


/**
 * The class <code>CloudWebAppFactory</code> implements static methods that return instances of the class <code>{@link CloudWebApp}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudWebAppFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudWebAppFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudWebApp}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudWebApp createCloudWebApp() {
		return new CloudWebApp("", "", "");
	}


	/**
	 * Create an instance of the class <code>{@link CloudWebApp}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudWebApp createCloudWebApp2() {
		return new CloudWebApp("0123456789", "0123456789", "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link CloudWebApp}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudWebApp createCloudWebApp3() {
		return new CloudWebApp("An??t-1.0.txt", "An??t-1.0.txt", "An??t-1.0.txt");
	}


	/**
	 * Create an instance of the class <code>{@link CloudWebApp}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudWebApp createCloudWebApp4() {
		return new CloudWebApp(Parcel.obtain());
	}
}