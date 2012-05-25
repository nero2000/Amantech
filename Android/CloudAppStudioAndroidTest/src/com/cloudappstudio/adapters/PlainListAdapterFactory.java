package com.cloudappstudio.adapters;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;


/**
 * The class <code>PlainListAdapterFactory</code> implements static methods that return instances of the class <code>{@link PlainListAdapter}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class PlainListAdapterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private PlainListAdapterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PlainListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static PlainListAdapter createPlainListAdapter() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		return new PlainListAdapter(LoginActivityFactory.createLoginActivity(), list);
	}


	/**
	 * Create an instance of the class <code>{@link PlainListAdapter}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static PlainListAdapter createPlainListAdapter2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		return new PlainListAdapter(EntryDetailsActivityFactory.createEntryDetailsActivity(), list);
	}
}