package com.w2a.testCases;

import org.testng.annotations.Test;

import com.w2a.base.TopMenu;
import com.w2a.pages.LoginPage;
import com.w2a.pages.RegisterPage;

public class RegisterTest {
	
	@Test
	
	public void registerTest() {
		
		TopMenu menu = new TopMenu(null);
		LoginPage login = menu.goToLogin();
		RegisterPage register= login.goToRegister();
		register.verifyRegisterUrl();
	}
	
	
	

}
