package com.cloudappstudio.data;

import android.os.Parcel;
import android.os.Parcelable;

public class CloudWebApp implements Parcelable{
	private String title;
	private String description;
	private String appName;
	
	public CloudWebApp(Parcel parcel) {
		readFromParcel(parcel);
	}
	
	public CloudWebApp(String title, String description, String appName) {
		this.title = title;
		this.description = description;
		this.appName = appName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	// Parcelable methods
	
    @SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public CloudWebApp createFromParcel(Parcel in) {
            return new CloudWebApp(in);
        }
 
        public CloudWebApp[] newArray(int size) {
            return new CloudWebApp[size];
        }
    };
    
	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(title);
		dest.writeString(description);
		dest.writeString(appName);
	}
	
    public void readFromParcel(Parcel in) {
        title = in.readString();
        description = in.readString();
        appName = in.readString();
    }
}
