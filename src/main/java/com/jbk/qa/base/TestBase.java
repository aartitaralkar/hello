package com.jbk.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.jbk.qa.util.TestUtil;

public class TestBase {
	
	public static final Logger logger = Logger.getLogger(TestBase.class.getName());

	public static WebDriver driver;
	public static Properties properties;
	public static EventFiringWebDriver e_driver;
	
	//public static WebEventListener eventListener;
	

	public TestBase() throws IOException
	{
		properties = new Properties();
		
		String log4jConfPath = "C:\\Users\\SUNIL\\eclipse-workspace\\CRMPractice\\src\\main\\resources\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUNIL\\eclipse-workspace\\CRMPractice\\src\\main\\java\\com\\jbk\\qa\\config\\config.properties");
		properties.load(file);
		
		logger.info("loading config.properties");
	}
	
	public static void initialization()
	{
		String browserName = properties.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\Desktop\\Selenium Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SUNIL\\Desktop\\Selenium Software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("url"));
	}
    
	

}
