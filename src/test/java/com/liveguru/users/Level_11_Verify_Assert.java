package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.loginUndisplayPageObject;
import pageObjects_liveguru.tvPageObject;

public class Level_11_Verify_Assert extends AbstractTest {
	WebDriver driver;

	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		loginUndisplayPage = PageGeneratorManager.getLoginUndisplayPage(driver);
	}

	@Test
	public void TC_01_Check_Undisplay() {
		
		verifyTrue(loginUndisplayPage.isMyAccountUndisplay());
		loginUndisplayPage.clickToAccount();
		verifyTrue(loginUndisplayPage.isMyAccountDisplay());
		//Step fail test verify custom
		verifyTrue(loginUndisplayPage.isErrorMessageUndisplaySubscribe());
		loginUndisplayPage.clickSubscribe();
		String errorMessageSubscribe = loginUndisplayPage.getTextErrorMessageSubscribe();
		System.out.println(errorMessageSubscribe);
		verifyTrue(loginUndisplayPage.isErrorMessageDisplaySubscribe());
		verifyEquals(errorMessageSubscribe, "THIS IS A REQUIRED FIELD");
		tvPage = loginUndisplayPage.clickToTV();

		
		
		
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private loginUndisplayPageObject loginUndisplayPage;
	private tvPageObject tvPage;

}