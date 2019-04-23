package com.w2a.base;

import org.openqa.selenium.WebDriver;

import com.w2a.pages.LoginPage;

public class TopMenu {

	WebDriver driver;

	public TopMenu(WebDriver driver) {
		this.driver = driver;
		Page.log.debug("Top menu object called!!");
	}

	public void goToDemo() {
		Page.click("DemoLink");
	}

	public void goToPrincing() {

	}

	public  void goToFeatures() {

	}

	public  void goToProduct() {

	}

	public  void goToHosting() {

	}

	public  void goToServices() {

	}

	public  void goToCompany() {

	}

	public LoginPage goToLogin() {
		Page.click("LoginLink");
		Page.log.debug("Clicked on login!!");
		return new LoginPage();

	}
}
