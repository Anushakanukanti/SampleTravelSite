package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	public LoginPage() {

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	}
	
	public RegisterPage goToRegister(){
		click("RegisterBtn");
		log.debug("Clicked on register btn!!");
		return new RegisterPage();
	}
	
	public void Login() {
		
		
	}

}
