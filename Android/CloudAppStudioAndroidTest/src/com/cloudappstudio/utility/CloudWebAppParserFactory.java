package com.cloudappstudio.utility;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudAuthIdFactory;


/**
 * The class <code>CloudWebAppParserFactory</code> implements static methods that return instances of the class <code>{@link CloudWebAppParser}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudWebAppParserFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudWebAppParserFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudWebAppParser}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudWebAppParser createCloudWebAppParser() {
		return new CloudWebAppParser(CloudAuthIdFactory.createCloudAuthId());
	}
}