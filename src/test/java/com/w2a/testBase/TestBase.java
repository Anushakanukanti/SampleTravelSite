package com.w2a.testBase;

import org.testng.annotations.AfterTest;

import com.w2a.base.Page;

public class TestBase extends Page{
	
	@AfterTest
	
	public static void quit() {
		driver.quit();
	}

}
