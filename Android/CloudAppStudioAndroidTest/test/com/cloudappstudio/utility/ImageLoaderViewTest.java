package com.cloudappstudio.utility;

import javax.print.attribute.AttributeSet;

import org.junit.*;
import static org.junit.Assert.*;
import com.cloudappstudio.activities.EntryDetailsActivity;
import android.content.Context;
import android.annotation.*;
import android.os.*;

public class ImageLoaderViewTest {
	public void testImageLoaderView_1()
		throws Exception {
		EntryDetailsActivity context = new EntryDetailsActivity();
		AttributeSet attrSet = null;
		assertNotNull(context);
	}

	public void testImageLoaderView_2()
		throws Exception {
		EntryDetailsActivity context = new EntryDetailsActivity();
		AttributeSet attrSet = null;
		assertNotNull(context);
	}

	public void testImageLoaderView_3()
		throws Exception {
		EntryDetailsActivity context = new EntryDetailsActivity();
		String imageUrl = "";
		assertNotNull("");
	}
	public void testSetImageDrawable()
		throws Exception {
		String imageUrl = "";

		fixture.setImageDrawable(imageUrl);

			}
	public void setUp()
		throws Exception {
	}
	public void tearDown()
		throws Exception {
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ImageLoaderViewTest.class);
	}
}