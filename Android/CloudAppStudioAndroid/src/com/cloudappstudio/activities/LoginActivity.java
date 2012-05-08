package com.cloudappstudio.activities;

import java.util.ArrayList;
import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.cloudappstudio.android.R;

/**
 * An activity that lets the user log in to their google account
 * @author mrjanek <Jesper Lindberg>
 */

public class LoginActivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.login_view);	
		
		final List<String> accountNames = getGoogleAccounts();		
        ListView accountList = (ListView) findViewById(R.id.accountListView);
        accountList.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, accountNames));
        
        accountList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				 Intent intent = new Intent(getApplicationContext(), WebApplicationsActivity.class);
				 startActivity(intent);
			}
		});
        
	}

	private List<String> getGoogleAccounts() {
		AccountManager accountManager = AccountManager.get(getApplicationContext());
		
        final Account[] accounts = accountManager.getAccountsByType("com.google");
        final List<String> accountNames = new ArrayList<String>();
        
        for (Account account : accounts)
            accountNames.add(account.name);
        		
		return accountNames;
	}

}
