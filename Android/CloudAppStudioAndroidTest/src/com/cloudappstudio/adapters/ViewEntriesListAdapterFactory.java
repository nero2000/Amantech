package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;
import com.cloudappstudio.data.CloudViewEntry;
import android.os.Parcel;
import android.content.Context;
import com.cloudappstudio.data.ColumnValue;


/**
 * The class <code>ViewEntriesListAdapterFactory</code> implements static methods that return instances of the class <code>{@link ViewEntriesListAdapter}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ViewEntriesListAdapterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private ViewEntriesListAdapterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ViewEntriesListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ViewEntriesListAdapter createViewEntriesListAdapter() {
		ArrayList<CloudViewEntry> list = new ArrayList<CloudViewEntry>();
		ArrayList<ColumnValue> list1 = new ArrayList<ColumnValue>();
		list1.add(new ColumnValue("", ""));
		CloudViewEntry cloudViewEntry = new CloudViewEntry(list1);
		list.add(cloudViewEntry);
		list.add(new CloudViewEntry(Parcel.obtain()));
		return new ViewEntriesListAdapter(LoginActivityFactory.createLoginActivity(), list);
	}


	/**
	 * Create an instance of the class <code>{@link ViewEntriesListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ViewEntriesListAdapter createViewEntriesListAdapter2() {
		ArrayList<CloudViewEntry> list = new ArrayList<CloudViewEntry>();
		ArrayList<ColumnValue> list1 = new ArrayList<ColumnValue>();
		list1.add(new ColumnValue("", ""));
		CloudViewEntry cloudViewEntry = new CloudViewEntry(list1);
		list.add(cloudViewEntry);
		return new ViewEntriesListAdapter(EntryDetailsActivityFactory.createEntryDetailsActivity(), list);
	}
}