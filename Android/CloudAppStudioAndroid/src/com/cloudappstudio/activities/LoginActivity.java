package com.cloudappstudio.activities;

import java.util.ArrayList;
import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudAuthId;
import com.cloudappstudio.utility.CloudOAuth;

/**
 * An activity that lets the user log in to their google account
 * @author mrjanek <Jesper Lindberg>
 */

public class LoginActivity extends SherlockActivity {
	private Account[] accounts;
	private ProgressDialog progressDialog;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.login_view);	

		accounts = getGoogleAccounts();		
        ListView accountList = (ListView) findViewById(R.id.accountListView);
        accountList.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, accountsToString(accounts)));
        
        accountList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, final int pos,long id) {
				new LoginAuthTask().execute(pos);
			}
        });
	}
	
    /**
     * Generates a string list of available account names
     * @param accounts the accounts data
     * @return a list of account names
     */
	private List<String> accountsToString(Account[] accounts) {
        final List<String> accountNames = new ArrayList<String>();       
        for (Account account : accounts)
            accountNames.add(account.name);
        		
		return accountNames;
	}
	
	/**
	 * Generates an array of the available accounts on the device
	 * @return the accounts array
	 */
	private Account[] getGoogleAccounts() {
		AccountManager accountManager = AccountManager.get(getApplicationContext());
		return accountManager.getAccountsByType("com.google");
	}
	
	/**
	 * Authenticates the user in a thread
	 * @author mrjanek
	 */
	public class LoginAuthTask extends AsyncTask<Integer, Integer, CloudAuthId> {
		
		@Override
		protected void onPreExecute() {
			progressDialog = ProgressDialog.show(LoginActivity.this, "Authenticating", "Authenticating user information..");
		}
		
		@Override
		protected CloudAuthId doInBackground(Integer... params) {
			int index = params[0];
			CloudAuthId id = null;
					
			try {
				CloudOAuth ca = new CloudOAuth(accounts[index], LoginActivity.this);
				id = ca.getCloudAuthId();
			} 
			
			catch(Exception e) {
				id = null;
			}
			
			return id;
		}

		@Override
		protected void onPostExecute(CloudAuthId id) {
			progressDialog.dismiss();
			
			if (id != null) {
				Intent intent = new Intent(getApplicationContext(), WebApplicationsActivity.class);
				intent.putExtra("id", id);
				startActivity(intent);
			}
			
			else {
				Toast.makeText(getApplicationContext(), "Failed to authenticate user information", Toast.LENGTH_SHORT).show();
			}
		}
	}
}



