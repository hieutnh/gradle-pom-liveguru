package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.Home13PageUI;

public class home13PageObject extends AbstractPage {
	WebDriver driver;

	public home13PageObject(WebDriver driver) {

		this.driver = driver;
	}

	public register13PageObject clickRegisterHeader() {
		waitToElementClickAble(driver, Home13PageUI.REGISTER_LINK);
		clickToElement(driver, Home13PageUI.REGISTER_LINK);
		return PageGeneratorManager.getregisterPage13(driver);
	}

	public void clickAccountHeader() {
		waitToElementClickAble(driver, Home13PageUI.ACCOUNT_LINK);
		clickToElement(driver, Home13PageUI.ACCOUNT_LINK);
	}

	public loginPageObject13 clickLoginButton() {
		waitToElementClickAble(driver, Home13PageUI.LOGIN_LINK);
		clickToElement(driver, Home13PageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage13(driver);
	}

}
