package com.w2a.rough;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WindowHandle {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
	
System.out.println("Click on the button!!");
System.out.println(driver.getCurrentUrl());

for(String winHandle : driver.getWindowHandles()){
    driver.switchTo().window(winHandle); 
}


System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).click();
	}
	
	}

	

