package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.loginUndisplayPageObject;

public class Level_10_Element_Undisplay extends AbstractTest {
	WebDriver driver;

	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		loginUndisplayPage = PageGeneratorManager.getLoginUndisplayPage(driver);
	}

	@Test
	public void TC_01_Check_Undisplay() {
		Assert.assertTrue(loginUndisplayPage.isMyAccountUndisplay());
		loginUndisplayPage.clickToAccount();
		Assert.assertTrue(loginUndisplayPage.isMyAccountDisplay());
		Assert.assertTrue(loginUndisplayPage.isErrorMessageUndisplaySubscribe());
		loginUndisplayPage.clickSubscribe();
		Assert.assertTrue(loginUndisplayPage.isErrorMessageDisplaySubscribe());
		
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private loginUndisplayPageObject loginUndisplayPage;

}