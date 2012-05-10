package com.cloudappstudio.data;

import android.os.Parcel;
import android.os.Parcelable;

public class CloudView implements Parcelable{
	private String title;
	private String viewName;
	
	public CloudView(Parcel parcel) {
		readFromParcel(parcel);
	}
	
	public CloudView(String title, String viewName) {
		this.title = title;
		this.viewName = viewName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	// Parcelable methods
	
    @SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public CloudView createFromParcel(Parcel in) {
            return new CloudView(in);
        }
 
        public CloudView[] newArray(int size) {
            return new CloudView[size];
        }
    };
    
	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(title);
		dest.writeString(viewName);
	}
	
    public void readFromParcel(Parcel in) {
        title = in.readString();
        viewName = in.readString();
    }
}
