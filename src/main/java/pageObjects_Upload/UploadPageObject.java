package pageObjects_Upload;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUI_uploadFile.UploadFile;

public class UploadPageObject extends AbstractPage {
	WebDriver driver;

	public UploadPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isFileLoaded(String filename) {
		waitToElementVisible(driver, UploadFile.DYNAMIC_FILE_LOADED_TEXT, filename);
		return isElementDisplayed(driver, UploadFile.DYNAMIC_FILE_LOADED_TEXT, filename);
	}

	public void clickToStartUpload(String filename) {
		waitToElementClickAble(driver, UploadFile.DYNAMIC_START_BUTTON, filename);
		clickToElement(driver, UploadFile.DYNAMIC_START_BUTTON, filename);
		
	}

	public boolean isFileUploadSuccess(String filename) {
		waitToElementVisible(driver, UploadFile.DYNAMIC_FILE_LOADED_LINK, filename);
		return isElementDisplayed(driver, UploadFile.DYNAMIC_FILE_LOADED_LINK, filename);
	}

}