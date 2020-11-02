package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.loginDatatablePageObject;
import pageObjects_liveguru.managerCustomersObject;

public class Level_08_Data_Table extends AbstractTest {
	WebDriver driver;

	// run all browsers
	@Parameters({"Browser", "url"})
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);

		loginPage = PageGeneratorManager.getLoginDataTablePage(driver);

		loginPage.inputUserNameTextBox("user01");

		loginPage.inputPasswordTextBox("guru99com");

		managerCustomersPage = PageGeneratorManager.getmanagerCustomersPage(driver);
		managerCustomersPage = loginPage.clickLoginButton();

		managerCustomersPage.clickToClosePopupIncoming();

	}

	@Test
	public void TC_01_Data_Table() {

		managerCustomersPage.inputManagerCustomerTableColumnName("Name", "taotest taotest1");
		managerCustomersPage.inputManagerCustomerTableColumnName("Email", "taotest1@gmail.com");
		managerCustomersPage.inputManagerCustomerTableColumnName("Telephone", "1234 56789");
		managerCustomersPage.inputManagerCustomerTableColumnName("ZIP", "20000");
		managerCustomersPage.clickSearchDataButton("Search");
//		managerCustomersPage.loadingDisable();
//		managerCustomersPage.clickSearchDataButton("Reset Filter");
//		managerCustomersPage.loadingDisable();
//		managerCustomersPage.selectItemToListCountry("Country", "Vietnam");
//		managerCustomersPage.clickSearchDataButton("Search");

		Assert.assertTrue(managerCustomersPage.isDisplayData("Name", "taotest taotest1", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("Email", "taotest1@gmail.com", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("Telephone", "1234 56789", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("ZIP", "20000", "1"));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private loginDatatablePageObject loginPage;
	private managerCustomersObject managerCustomersPage;

}