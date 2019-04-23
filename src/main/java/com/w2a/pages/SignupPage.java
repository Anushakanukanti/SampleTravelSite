package com.w2a.pages;

import com.w2a.base.Page;

public class SignupPage extends Page{
	
	public static void SignUp() {
		type("FirstName", "Anusha");
		type("LastName", "K");
		type("MobileNumber", "7674829674");
		type("Email", "kanukanti.anusha@gmail.com");
		type("Password", "Anusha23");
		type("ConfirmPassword", "Anusha23");
		click("SignUpBtn");
	}

}
