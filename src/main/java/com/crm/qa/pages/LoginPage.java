package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginn;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;

	@FindBy(xpath = "(//a[normalize-space()='Sign Up'])[1]")
	WebElement signupbtn;
	


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String em, String pw) {
		loginn.click();
		email.sendKeys(em);
		password.sendKeys(pw);
		loginbtn.click();
		return new HomePage();
	}
	
	

}
