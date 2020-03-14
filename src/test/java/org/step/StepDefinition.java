package org.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.data.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	@Given("User in the Adactin login page")
	public static void user_in_the_Adactin_login_page() {
	launchChromeBrowser();
	loadUrl();
	}

	@When("The user to enter the valid username and password {string} and {string}")
	public static void the_user_to_enter_the_valid_username_and_password_and(String s1, String s2) {
		WebElement txtUser = driver.findElement(By.id("username"));
		fill(txtUser, s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		fill(txtPass, s2);
		WebElement button = driver.findElement(By.id("login"));
		btnClick(button);	
	}

	@When("The user to login the page")
	public static void the_user_to_login_the_page() {
	WebElement s3 = driver.findElement(By.id("location"));
		Select s=new Select(s3);
		s.selectByIndex(2);
		WebElement s4 = driver.findElement(By.id("hotels"));
		Select s1=new Select(s4);
		s1.selectByIndex(3);
		WebElement s5 = driver.findElement(By.id("room_type"));
		Select s2=new Select(s5);
		s2.selectByIndex(2);
		WebElement s8 = driver.findElement(By.id("room_nos"));
		Select s9=new Select(s8);
		s9.selectByIndex(2);
		WebElement p = driver.findElement(By.id("datepick_in"));
	p.clear();
		p.sendKeys("09/03/2020");
		WebElement p1 = driver.findElement(By.id("datepick_out"));
		p1.clear();
		p1.sendKeys("09/04/2020");
		WebElement p2 = driver.findElement(By.id("adult_room"));
		Select m=new Select(p2);
		m.selectByIndex(3);
		WebElement p0 = driver.findElement(By.id("child_room"));
		Select n=new Select(p0);
	n.selectByIndex(3);
	}

@Then("The user navigation to the next page")
	public void the_user_navigation_to_the_next_page() {
	WebElement p = driver.findElement(By.id("Submit"));
	p.click();
	WebElement pn = driver.findElement(By.id("radiobutton_0"));
	pn.click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	WebElement pn1 = driver.findElement(By.id("continue"));
	pn1.click();

	
	
	}
}
