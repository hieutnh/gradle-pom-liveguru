package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.addressBook13PageObject;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.loginPageObject13;
import pageObjects_liveguru.mobilePageObject;
import pageObjects_liveguru.myApplications13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.myOrders13PageObject;
import pageObjects_liveguru.myWishlist13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_15_Sort_Data extends AbstractTest {
	private WebDriver driver;
	String username, passWord;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		username = "taotest1@gmail.com";
		passWord = "123123";
	}

	@Test
	public void TC_01_Login() {
		homePage = PageGeneratorManager.getHomePage13(driver);
		homePage.clickAccountHeader();
		login13Page = homePage.clickLoginButton();
		login13Page.inputAccountToLoginTextBox(username, "email");
		login13Page.inputAccountToLoginTextBox(passWord, "pass");
		myDashBoard13Page = login13Page.clickToButtonLogin();
		mobilePage = myDashBoard13Page.clickToMobileLink();
		mobilePage.selectSortName("Name");
		verifyTrue(mobilePage.isNameSortAscending());
		mobilePage.selectSortName("Price");
		mobilePage.selectSortName("Position");

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
	private mobilePageObject mobilePage;

}