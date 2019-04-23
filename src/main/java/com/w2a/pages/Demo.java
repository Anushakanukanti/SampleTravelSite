package com.w2a.pages;
import com.w2a.base.Page;

public class Demo extends Page{
	
	//First section

	
	public HomepageFrontend goToHomepageFrontend() {
		click("HomepageFrontendBtn");
		log.debug("Clicked on Homepagebtn!!");
		return new HomepageFrontend();
		
	}
	public static void goToAdministratorBackend() {
		click("AdministratorBackendBtn");
	}
	public static void goToSupplierBackend() {
		click("SupplierBackendBtn");
	}
	
	//Second section
	
	public static void goToExpediaCheckdemo() {
		click("ExpediaCheckdemoBtn");
	}
	public static void ExpediaPricing() {
		click("ExpediaPricingBtn");
	}
	public static void HotelbedsCheckdemo() {
		click("HotelbedsCheckdemoBtn");
	}
	public static void goToHotelbedsPricing() {
		click("HotelbedsPricingBtn");
	}
	
	
	//Third section
	public void goToSubmitRequirements() {
		click("SubmitRequirementsBtn");
	}
}
