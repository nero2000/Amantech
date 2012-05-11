package com.cloudappstudio.utility;

import java.io.IOException;
import java.net.MalformedURLException;

import com.cloudappstudio.android.R;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class ImageLoaderView extends RelativeLayout {

	private static final int COMPLETE = 0;
	private static final int FAILED = 1;

	private Context mContext;
	private Drawable mDrawable;
	private ProgressBar mSpinner;
	private ImageView mImage;
	
	public ImageLoaderView(final Context context, final AttributeSet attrSet) {
		super(context, attrSet);
		final String url = attrSet.getAttributeValue(null, "image");
		if(url != null){
			instantiate(context, url);
		} else {
			instantiate(context, null);
		}
	}
	
	public ImageLoaderView(final Context context, final String imageUrl) {
		super(context);
		instantiate(context, imageUrl);		
	}

	private void instantiate(final Context context, final String imageUrl) {
		mContext = context;
		this.setGravity(Gravity.CENTER);
		
		mImage = new ImageView(mContext);
		mImage.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		mImage.setScaleType(ScaleType.CENTER_CROP);
		
		mImage.setDrawingCacheEnabled(true);
		this.setDrawingCacheEnabled(true);
		
		mSpinner = new ProgressBar(mContext);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		
		mSpinner.setLayoutParams(params);
		mSpinner.setIndeterminate(true);	
		
		addView(mImage);
		addView(mSpinner);
		
		if(imageUrl != null){
			setImageDrawable(imageUrl);
		}
	}

	public void setImageDrawable(final String imageUrl) {
		mDrawable = null;
		mSpinner.setVisibility(View.VISIBLE);
		mImage.setVisibility(View.GONE);
		new Thread(){
			public void run() {
				try {
					mDrawable = getDrawableFromUrl(imageUrl);
					imageLoadedHandler.sendEmptyMessage(COMPLETE);
				} catch (MalformedURLException e) {
					imageLoadedHandler.sendEmptyMessage(FAILED);
				} catch (IOException e) {
					imageLoadedHandler.sendEmptyMessage(FAILED);
				}
			};
		}.start();
	}
	

	private final Handler imageLoadedHandler = new Handler(new Callback() {
		public boolean handleMessage(Message msg) {
			switch (msg.what) {
			
			case COMPLETE:
				mImage.setImageDrawable(mDrawable);
				mImage.setVisibility(View.VISIBLE);
				mSpinner.setVisibility(View.GONE);
				break;
				
			case FAILED:	
			default:
				mImage.setScaleType(ScaleType.FIT_XY);
				mImage.setImageDrawable(getResources().getDrawable(R.drawable.no_image_found));
				mImage.setVisibility(View.VISIBLE);
				mSpinner.setVisibility(View.GONE);
				break;
			}
			return true;
		}		
	});

	private static Drawable getDrawableFromUrl(final String url) throws IOException, MalformedURLException {
		return Drawable.createFromStream(((java.io.InputStream)new java.net.URL(url).getContent()), "name");
	}
	
}

