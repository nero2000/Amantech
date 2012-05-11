package com.cloudappstudio.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Simple data structure for matching columns to values 
 * @author mrjanek <Jesper Lindberg>
 */
public class ColumnValue implements Parcelable {
	private String mColumn;
	private String mValue;
	
	public ColumnValue(Parcel parcel) {
		readFromParcel(parcel);
	}
	
	public ColumnValue(String column, String value) {
		this.mColumn = column;
		this.mValue = value;
	}

	public String getColumn() {
		return mColumn;
	}

	public void setColumn(String volumn) {
		this.mColumn = volumn;
	}

	public String getValue() {
		return mValue;
	}

	public void setValue(String value) {
		this.mValue = value;
	}
	
	public boolean IsImageUrl() {
        try {
        	String regex = "(https?:\\/\\/.*\\.(?:png|jpg|gif|jpeg|bmp))";
            Pattern patt = Pattern.compile(regex);
            Matcher matcher = patt.matcher(mValue);
            return matcher.matches();
        } 
        catch (RuntimeException e) {
        	return false;
        }  
	}
	
	// Parcelable methods
	
    @SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ColumnValue createFromParcel(Parcel in) {
            return new ColumnValue(in);
        }
 
        public ColumnValue[] newArray(int size) {
            return new ColumnValue[size];
        }
    };
    
	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(mColumn);
		dest.writeString(mValue);
	}
	
    public void readFromParcel(Parcel in) {
    	mColumn = in.readString();
    	mValue = in.readString();
    }
}
