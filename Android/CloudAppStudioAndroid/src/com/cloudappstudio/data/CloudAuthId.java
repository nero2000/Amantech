package com.cloudappstudio.data;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public class CloudAuthId implements Parcelable{
	private Account account;
	private String token;
	
	public CloudAuthId(Account account, String token) {
		this.account = account;
		this.token = token;
	}
	
	public CloudAuthId(Parcel parcel) {
		readFromParcel(parcel);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getToken() {
		return token;
	}
	
	public void refreshToken(Context context) {
		AccountManager.get(context).invalidateAuthToken("com.google", token);
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	// Parcelable methods
	
    @SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public CloudAuthId createFromParcel(Parcel in) {
            return new CloudAuthId(in);
        }
 
        public CloudAuthId[] newArray(int size) {
            return new CloudAuthId[size];
        }
    };
    
	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(account, flags);
		dest.writeString(token);
	}
	
    public void readFromParcel(Parcel in) {
        account = in.readParcelable(Account.class.getClassLoader());
        token = in.readString();
    }
}
