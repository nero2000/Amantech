package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.os.Parcel;
import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;
import com.cloudappstudio.data.CloudView;


/**
 * The class <code>ViewsListAdapterFactory</code> implements static methods that return instances of the class <code>{@link ViewsListAdapter}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ViewsListAdapterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private ViewsListAdapterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ViewsListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ViewsListAdapter createViewsListAdapter() {
		ArrayList<CloudView> list = new ArrayList<CloudView>();
		list.add(new CloudView("", ""));
		list.add(new CloudView("0123456789", "0123456789"));
		list.add(new CloudView(Parcel.obtain()));
		return new ViewsListAdapter(LoginActivityFactory.createLoginActivity(), list);
	}


	/**
	 * Create an instance of the class <code>{@link ViewsListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ViewsListAdapter createViewsListAdapter2() {
		ArrayList<CloudView> list = new ArrayList<CloudView>();
		list.add(new CloudView("", ""));
		return new ViewsListAdapter(EntryDetailsActivityFactory.createEntryDetailsActivity(), list);
	}
}