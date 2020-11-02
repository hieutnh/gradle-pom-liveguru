package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.DataHelper;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_16_Data_Generate_1_Common extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;
	Select select;
	public static String email, pass, confirmpass, Ten, Ho, tendem;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeTest
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		data = DataHelper.getData();

		Ten = "Hoang";
		Ho = "Khoi";
		tendem = "midlename";
		email = "testthoima" + getRanDom() + "@gmail.com";
		pass = data.getPassword();
		confirmpass = "123456";

	}

	@Test
	public void TC_01_Register() {
		homePage = PageGeneratorManager.getHomePage13(driver);
		homePage.clickAccountHeader();
		register13Page = homePage.clickRegisterHeader();

		register13Page.inputAllFielsRegister(data.getFirstName(), "firstname");
		register13Page.inputAllFielsRegister(tendem, "middlename");
		register13Page.inputAllFielsRegister(data.getLastName(), "lastname");
		register13Page.inputAllFielsRegister(data.getEmail(), "email_address");
		register13Page.inputAllFielsRegister(pass, "password");
		register13Page.inputAllFielsRegister(pass, "confirmation");
		myDashBoard13Page = register13Page.clickRegisterButton();

		removeDriver();
	}

	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
	private DataHelper data;

}