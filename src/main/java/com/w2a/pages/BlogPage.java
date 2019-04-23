package com.w2a.pages;

import org.testng.Assert;

import com.w2a.base.Page;

public class BlogPage extends Page {
	
	public static void verifyURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.phptravels.net/blog");
	}
}
