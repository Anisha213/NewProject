package com.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Cucumberjava\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
			}
	public static void loadUrl() {
		driver.get("https://adactin.com/HotelApp/");
	}
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
	e.click();
	
	}
	public static void location(WebElement e) {
		Select s=new Select(e);
		s.selectByIndex(2);
		
	}
}
