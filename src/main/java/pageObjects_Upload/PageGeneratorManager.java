package pageObjects_Upload;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static UploadPageObject getUploadPageObject(WebDriver driver) {
		return new UploadPageObject(driver);
	}
}

