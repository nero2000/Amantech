package com.cloudappstudio.data;

import android.accounts.Account;
import android.os.Parcel;


/**
 * The class <code>CloudAuthIdFactory</code> implements static methods that return instances of the class <code>{@link CloudAuthId}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudAuthIdFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudAuthIdFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudAuthId}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudAuthId createCloudAuthId() {
		return new CloudAuthId(Parcel.obtain());
	}


	/**
	 * Create an instance of the class <code>{@link CloudAuthId}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudAuthId createCloudAuthId2() {
		return new CloudAuthId(new Account("", ""), "");
	}


	/**
	 * Create an instance of the class <code>{@link CloudAuthId}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudAuthId createCloudAuthId3() {
		return new CloudAuthId(new Account("0123456789", "0123456789"), "0123456789");
	}
}