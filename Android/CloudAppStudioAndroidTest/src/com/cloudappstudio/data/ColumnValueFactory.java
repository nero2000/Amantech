package com.cloudappstudio.data;

import android.os.Parcel;


/**
 * The class <code>ColumnValueFactory</code> implements static methods that return instances of the class <code>{@link ColumnValue}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ColumnValueFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private ColumnValueFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ColumnValue}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ColumnValue createColumnValue() {
		return new ColumnValue("", "");
	}


	/**
	 * Create an instance of the class <code>{@link ColumnValue}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ColumnValue createColumnValue2() {
		return new ColumnValue("0123456789", "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link ColumnValue}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ColumnValue createColumnValue3() {
		return new ColumnValue(Parcel.obtain());
	}
}