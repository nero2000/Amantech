package com.cloudappstudio.activities;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;


public class LoginActivityTest {
	
	public void testOnCreate()
		throws Exception {
		LoginActivity fixture = new LoginActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);
	}

	
	public void setUp()
		throws Exception {
		
	}

	
	public void tearDown()
		throws Exception {
		
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LoginActivityTest.class);
	}
}