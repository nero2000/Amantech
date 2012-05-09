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
<<<<<<< HEAD
//import com.cloudappstudio.utility.CloudViewEntryParser;
import com.cloudappstudio.utility.CloudeOAuth;
=======
>>>>>>> 37b657ba056d9a41aba60dd62a1d0e1216afe244

/**
 * An activity that lets the user log in to their google account
 * @author mrjanek <Jesper Lindberg>
 */

public class LoginActivity extends SherlockActivity {
<<<<<<< HEAD
	
	private AccountManager am;
	private Activity       activity;
=======
>>>>>>> 37b657ba056d9a41aba60dd62a1d0e1216afe244
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.cloudappstudio.android.R.layout.login_view);	
		
		final List<String> accountNames = getGoogleAccounts();		
        ListView accountList = (ListView) findViewById(R.id.accountListView);
        accountList.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, accountNames));
        
        accountList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
<<<<<<< HEAD

			public void onItemClick(AdapterView<?> parent, View view, final int pos,
					long id) {
				 Log.d("test","cliking");
				 
				 new Thread(new Runnable()
					{
					public void run()
					{
						CloudeOAuth ca = new CloudeOAuth();
						try{
						String token = ca.getToken(accounts[pos], LoginActivity.this);
						String content = ca.getContent("https://cloudappstudio360.appspot.com/api/json/v2/apps.json", token);
						Log.d("debug",content);
						}catch(Exception e){
							
							Log.d("debug","No go!");
						}
					}}).start();
					
				 
				Intent intent = new Intent(getApplicationContext(), WebApplicationsActivity.class);
				startActivity(intent);
				
=======
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				 Intent intent = new Intent(getApplicationContext(), WebApplicationsActivity.class);
				 startActivity(intent);
>>>>>>> 37b657ba056d9a41aba60dd62a1d0e1216afe244
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

