package com.w2a.pages;

import com.w2a.base.Page;

public class HomepageFrontend extends Page{
	public HomepageFrontend() {

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		log.debug(driver.getCurrentUrl());
		log.debug("Window handle changed!!");
	}

	public void goToLogin() {
		click("MyAccountLink");
		click("LoginLink");
	}
	public void goToSignup() {
		click("MyAccountLink");
		click("SignupLink");
	}
	public BlogPage goToBlog() {
		click("BlogLink");
	
		log.debug("Clicked on Blog!!");
		return new BlogPage();
		
	}
}
