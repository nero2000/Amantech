package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.os.Parcel;
import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;
import com.cloudappstudio.data.ColumnValue;


/**
 * The class <code>ColumnValueListAdapterFactory</code> implements static methods that return instances of the class <code>{@link ColumnValueListAdapter}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ColumnValueListAdapterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private ColumnValueListAdapterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ColumnValueListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ColumnValueListAdapter createColumnValueListAdapter() {
		ArrayList<ColumnValue> list = new ArrayList<ColumnValue>();
		list.add(new ColumnValue("", ""));
		list.add(new ColumnValue("0123456789", "0123456789"));
		list.add(new ColumnValue(Parcel.obtain()));
		return new ColumnValueListAdapter(LoginActivityFactory.createLoginActivity(), list);
	}


	/**
	 * Create an instance of the class <code>{@link ColumnValueListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ColumnValueListAdapter createColumnValueListAdapter2() {
		ArrayList<ColumnValue> list = new ArrayList<ColumnValue>();
		list.add(new ColumnValue("", ""));
		return new ColumnValueListAdapter(EntryDetailsActivityFactory.createEntryDetailsActivity(), list);
	}
}