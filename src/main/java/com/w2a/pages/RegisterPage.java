package com.w2a.pages;

import org.testng.Assert;

import com.w2a.base.Page;

public class RegisterPage extends Page {
	
public void verifyRegisterUrl() {
	Assert.assertEquals(driver.getCurrentUrl(), "https://phptravels.org/register.php");
	log.debug("verified the link!!");
}


}
