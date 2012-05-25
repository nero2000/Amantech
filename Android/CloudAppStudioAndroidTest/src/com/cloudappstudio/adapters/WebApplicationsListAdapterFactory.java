package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.os.Parcel;
import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;
import com.cloudappstudio.data.CloudWebApp;


/**
 * The class <code>WebApplicationsListAdapterFactory</code> implements static methods that return instances of the class <code>{@link WebApplicationsListAdapter}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class WebApplicationsListAdapterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private WebApplicationsListAdapterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link WebApplicationsListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static WebApplicationsListAdapter createWebApplicationsListAdapter() {
		ArrayList<CloudWebApp> list = new ArrayList<CloudWebApp>();
		list.add(new CloudWebApp("", "", ""));
		list.add(new CloudWebApp("0123456789", "0123456789", "0123456789"));
		list.add(new CloudWebApp("An??t-1.0.txt", "An??t-1.0.txt", "An??t-1.0.txt"));
		list.add(new CloudWebApp(Parcel.obtain()));
		return new WebApplicationsListAdapter(LoginActivityFactory.createLoginActivity(), list);
	}


	/**
	 * Create an instance of the class <code>{@link WebApplicationsListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static WebApplicationsListAdapter createWebApplicationsListAdapter2() {
		ArrayList<CloudWebApp> list = new ArrayList<CloudWebApp>();
		list.add(new CloudWebApp("", "", ""));
		return new WebApplicationsListAdapter(EntryDetailsActivityFactory.createEntryDetailsActivity(), list);
	}
}