package com.w2a.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;

public class Page {
	
	public static WebDriver driver;
	public static Properties OR = new Properties(); 
	public static Properties Config = new Properties(); 
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\testdata.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static WebDriverWait wait;
	public static TopMenu menu;
	

	public Page()  {
		if(driver==null){
		
		//Configuring the Property files
		
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Jenkins browser filter configuration
		
		
		if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty()) {
			browser = System.getenv("browser");
		}
		else {
			browser = Config.getProperty("browser");
		}
		Config.setProperty("browser", browser);
		
		
		
		//Configuring the browser drivers
		
		if (Config.getProperty("browser").equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else if (Config.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
		
		//Disabling notifications in chrome
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		
		driver = new ChromeDriver(options);
		}
		
		else if (Config.getProperty("browser").equals("ie")) {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		
		
		
		driver.get(Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Integer.parseInt(Config.getProperty("implicit.wait"))), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		menu = new TopMenu(driver);
		
	}
	}
	//Creating keywords
	
	//Click
	
	public static void click(String locator) {
		
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		
	}
	
	//Type
	
	public static void type(String locator, String value) {
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
	}
}
