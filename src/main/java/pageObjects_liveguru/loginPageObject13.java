package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.Login13PageUI;

public class loginPageObject13 extends AbstractPage {
	WebDriver driver;

	public loginPageObject13(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountToLoginTextBox(String value, String values) {
		waitToElementVisible(driver, Login13PageUI.DYNAMIC_INPUT_LOGIN_TEXTBOX, values);
		sendkeyToElement(driver, Login13PageUI.DYNAMIC_INPUT_LOGIN_TEXTBOX, value, values);
		
	}

	public myDashBoard13PageObject clickToButtonLogin() {
		waitToElementClickAble(driver, Login13PageUI.LOGINBUTTON);
		clickToElement(driver, Login13PageUI.LOGINBUTTON);
		return PageGeneratorManager.getmyDashBoardPage13(driver);
	}

	
}
