package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import driverFactory.DriverFactory;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.addressBook13PageObject;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myApplications13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.myOrders13PageObject;
import pageObjects_liveguru.myWishlist13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_13_Browser_Driver_Factory_Pattern_Parallel_ThreadLocal extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;
	Select select;
	String email, pass, confirmpass, Ten, Ho, tendem;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driverManager = DriverFactory.getBrowserDriver(BrowserName);
		driver = driverManager.getUrl(appUrl);

		Ten = "Hoang";
		Ho = "Khoi";
		tendem = "midlename";
		email = "testthoima" + getRanDom() + "@gmail.com";
		pass = "123456";
		confirmpass = "123456";

	}

	@Test
	public void TC_01_Register() {
		log.info("Register - Step 01: Open home page");
		homePage = PageGeneratorManager.getHomePage13(driver);
		log.info("Register - Step 02: Click Accont Header");
		homePage.clickAccountHeader();
		log.info("Register - Step 03: Click register Header");
		register13Page = homePage.clickRegisterHeader();

		log.info("Register - Step 04: Input all field request to register");
		register13Page.inputAllFielsRegister(Ten, "firstname");
		register13Page.inputAllFielsRegister(tendem, "middlename");
		register13Page.inputAllFielsRegister(Ho, "lastname");
		register13Page.inputAllFielsRegister(email, "email_address");
		register13Page.inputAllFielsRegister(pass, "password");
		register13Page.inputAllFielsRegister(confirmpass, "confirmation");

	}

	@Test
	public void TC_02_MyDashBoard() {
		log.info("Register - Step 05: Click button register");
		myDashBoard13Page = register13Page.clickRegisterButton();
		
		log.info("MyDashBoard - Step 01: Click Address Book button");
		myDashBoard13Page.clickToAllLinkMyDashBoard13(driver, "Address Book");
		addressBook13Page = PageGeneratorManager.getAddressBook13Page(driver);

		log.info("MyDashBoard - Step 02: Click My Orders button");
		addressBook13Page.clickToAllLinkMyDashBoard13(driver, "My Orders");
		myOrders13Page = PageGeneratorManager.getMyOrderPage13(driver);

		log.info("MyDashBoard - Step 03: Click My Wishlist button");
		myOrders13Page.clickToAllLinkMyDashBoard13(driver, "My Wishlist");
		myWishlist13Page = PageGeneratorManager.getMyWishlist13Page(driver);
		
		log.info("MyDashBoard - Step 04: Click My Applications button");
		myWishlist13Page.clickToAllLinkMyDashBoard13(driver, "My Applications");
		myDashBoard13Page = PageGeneratorManager.getmyDashBoardPage13(driver);
		
		driver = driverManager.quitDriver();
	}
//
//	@AfterClass
//	public void afterClass() {
//		removeDriver();
//	}

	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
	private addressBook13PageObject addressBook13Page;
	private myOrders13PageObject myOrders13Page;
	private myWishlist13PageObject myWishlist13Page;
	private myApplications13PageObject myApplications13Page;

}