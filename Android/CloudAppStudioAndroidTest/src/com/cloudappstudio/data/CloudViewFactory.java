package com.cloudappstudio.data;

import android.os.Parcel;


/**
 * The class <code>CloudViewFactory</code> implements static methods that return instances of the class <code>{@link CloudView}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudViewFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudView createCloudView() {
		return new CloudView("", "");
	}


	/**
	 * Create an instance of the class <code>{@link CloudView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudView createCloudView2() {
		return new CloudView("0123456789", "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link CloudView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudView createCloudView3() {
		return new CloudView(Parcel.obtain());
	}
}