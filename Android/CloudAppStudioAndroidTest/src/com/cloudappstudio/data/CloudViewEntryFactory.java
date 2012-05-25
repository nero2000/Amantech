package com.cloudappstudio.data;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;


/**
 * The class <code>CloudViewEntryFactory</code> implements static methods that return instances of the class <code>{@link CloudViewEntry}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class CloudViewEntryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private CloudViewEntryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CloudViewEntry}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudViewEntry createCloudViewEntry() {
		ArrayList<ColumnValue> list = new ArrayList<ColumnValue>();
		list.add(new ColumnValue("", ""));
		return new CloudViewEntry(list);
	}


	/**
	 * Create an instance of the class <code>{@link CloudViewEntry}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static CloudViewEntry createCloudViewEntry2() {
		return new CloudViewEntry(Parcel.obtain());
	}
}