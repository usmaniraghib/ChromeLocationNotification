package com.raghib.notification;

/*
 * REFERENCE
 * https://www.youtube.com/watch?v=BmEPwIoBh-I&ab_channel=QAFox
 */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NotificationChrome {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
	}
}
