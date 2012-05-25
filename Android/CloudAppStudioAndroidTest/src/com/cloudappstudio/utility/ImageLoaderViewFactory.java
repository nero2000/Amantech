package com.cloudappstudio.utility;

import com.cloudappstudio.activities.EntryDetailsActivityFactory;
import com.cloudappstudio.activities.LoginActivityFactory;
import android.content.Context;
import android.util.AttributeSet;


/**
 * The class <code>ImageLoaderViewFactory</code> implements static methods that return instances of the class <code>{@link ImageLoaderView}</code>.
 *
 * @generatedBy CodePro at 2012-05-22 10:09
 * @author denmif
 * @version $Revision: 1.0 $
 */
public class ImageLoaderViewFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	private ImageLoaderViewFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ImageLoaderView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ImageLoaderView createImageLoaderView() {
		return new ImageLoaderView(EntryDetailsActivityFactory.createEntryDetailsActivity(), "");
	}


	/**
	 * Create an instance of the class <code>{@link ImageLoaderView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ImageLoaderView createImageLoaderView2() {
		return new ImageLoaderView(EntryDetailsActivityFactory.createEntryDetailsActivity(), (AttributeSet) null);
	}


	/**
	 * Create an instance of the class <code>{@link ImageLoaderView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ImageLoaderView createImageLoaderView3() {
		return new ImageLoaderView(LoginActivityFactory.createLoginActivity(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link ImageLoaderView}</code>.
	 *
	 * @generatedBy CodePro at 2012-05-22 10:09
	 */
	public static ImageLoaderView createImageLoaderView4() {
		return new ImageLoaderView(LoginActivityFactory.createLoginActivity(), (AttributeSet) null);
	}
}