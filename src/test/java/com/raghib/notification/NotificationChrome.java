package com.raghib.notification;

/*
 * REFERENCE
 * https://www.youtube.com/watch?v=BmEPwIoBh-I&ab_channel=QAFox
 */

import com.raghib.selenium.BaseClass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class NotificationChrome extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://www.justdial.com/";
	
	public static void main(String[] args) {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		//BaseClass.quitDriver();
	}
}
