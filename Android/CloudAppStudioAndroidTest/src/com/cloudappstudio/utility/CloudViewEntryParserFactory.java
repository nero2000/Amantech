package com.cloudappstudio.utility;

import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.data.CloudAuthIdFactory;


/**
 * The class <code>CloudViewEntryParserFactory</code> implements static methods that return instances of the class <code>{@link CloudViewEntryParser}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewEntryParserFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudViewEntryParserFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudViewEntryParser}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudViewEntryParser createCloudViewEntryParser() {
		return new CloudViewEntryParser(CloudAuthIdFactory.createCloudAuthId());
	}
}