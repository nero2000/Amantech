package com.cloudappstudio.utility;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudAuthIdFactory;
import android.accounts.Account;
import android.app.Activity;


/**
 * The class <code>CloudOAuthFactory</code> implements static methods that return instances of the class <code>{@link CloudOAuth}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudOAuthFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudOAuthFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudOAuth}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudOAuth createCloudOAuth() {
		return new CloudOAuth(CloudAuthIdFactory.createCloudAuthId());
	}


	/**
	 * Create an instance of the class <code>{@link CloudOAuth}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudOAuth createCloudOAuth2()
		throws android.accounts.AuthenticatorException, android.accounts.OperationCanceledException, java.io.IOException {
		return new CloudOAuth(new Account("", ""), new Activity());
	}


	/**
	 * Create an instance of the class <code>{@link CloudOAuth}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudOAuth createCloudOAuth3()
		throws android.accounts.AuthenticatorException, android.accounts.OperationCanceledException, java.io.IOException {
		return new CloudOAuth(new Account("0123456789", "0123456789"), (Activity) null);
	}
}