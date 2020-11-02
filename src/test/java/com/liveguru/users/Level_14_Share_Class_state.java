package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.liveguru.common.Common_01_Register;

import commons.AbstractTest;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.addressBook13PageObject;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.loginPageObject13;
import pageObjects_liveguru.myApplications13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.myOrders13PageObject;
import pageObjects_liveguru.myWishlist13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_14_Share_Class_state extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);

	}

	@Test
	public void TC_01_Login() {
		homePage = PageGeneratorManager.getHomePage13(driver);
		homePage.clickAccountHeader();
		login13Page = homePage.clickLoginButton();
		login13Page.inputAccountToLoginTextBox(Common_01_Register.email, "email");
		login13Page.inputAccountToLoginTextBox(Common_01_Register.pass, "pass");
		myDashBoard13Page = login13Page.clickToButtonLogin();

	}



	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
	private addressBook13PageObject addressBook13Page;
	private myOrders13PageObject myOrders13Page;
	private myWishlist13PageObject myWishlist13Page;
	private myApplications13PageObject myApplications13Page;
	private loginPageObject13 login13Page;
	

}