package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_Upload.PageGeneratorManager;
import pageObjects_Upload.UploadPageObject;

public class Level_09_Upload_Multiple extends AbstractTest {
	WebDriver driver;
	String imageName01 = "Image01.png";
	String imageName02 = "Image02.png";
	String imageName03 = "Image03.png";

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		uploadPage = PageGeneratorManager.getUploadPageObject(driver);
	}

	@Test
	public void TC_01_Upload_One_File_Per_Time() {
		uploadPage.uploadMultipleFiles(driver, imageName01);
		uploadPage.sleepInSecond(2);
		Assert.assertTrue(uploadPage.isFileLoaded(imageName01));
		uploadPage.clickToStartUpload(imageName01);
		Assert.assertTrue(uploadPage.isFileUploadSuccess(imageName01));

		uploadPage.uploadMultipleFiles(driver, imageName02);
		uploadPage.sleepInSecond(2);
		Assert.assertTrue(uploadPage.isFileLoaded(imageName02));
		uploadPage.clickToStartUpload(imageName02);
		Assert.assertTrue(uploadPage.isFileUploadSuccess(imageName02));
		
		uploadPage.uploadMultipleFiles(driver, imageName03);
		uploadPage.sleepInSecond(2);
		Assert.assertTrue(uploadPage.isFileLoaded(imageName02));
		uploadPage.clickToStartUpload(imageName02);
		Assert.assertTrue(uploadPage.isFileUploadSuccess(imageName02));

	}
	
	@Test
	public void TC_01_Upload_Multiple_file_Per_Time() {
		uploadPage.uploadMultipleFiles(driver, imageName01, imageName02, imageName03);
		
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private UploadPageObject uploadPage;

}