package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.MyDashBoard13PageUI;

public class myDashBoard13PageObject extends AbstractPage {
	WebDriver driver;

	public myDashBoard13PageObject(WebDriver driver) {

		this.driver = driver;
	}

	public mobilePageObject clickToMobileLink() {
		waitToElementClickAble(driver, MyDashBoard13PageUI.MOBILE_LINK);
		clickToElement(driver, MyDashBoard13PageUI.MOBILE_LINK);
		return PageGeneratorManager.getmobilePage(driver);
	}

}
