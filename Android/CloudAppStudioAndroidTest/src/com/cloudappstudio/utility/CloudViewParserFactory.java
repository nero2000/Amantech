package com.cloudappstudio.utility;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudAuthIdFactory;


/**
 * The class <code>CloudViewParserFactory</code> implements static methods that return instances of the class <code>{@link CloudViewParser}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewParserFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudViewParserFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudViewParser}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudViewParser createCloudViewParser() {
		return new CloudViewParser(CloudAuthIdFactory.createCloudAuthId());
	}
}