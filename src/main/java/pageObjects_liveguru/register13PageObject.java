package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.Register13PageUI;

public class register13PageObject extends AbstractPage {
	WebDriver driver;

	public register13PageObject(WebDriver driver) {

		this.driver = driver;
	}

	public void inputAllFielsRegister(String value, String values) {
		waitToElementVisible(driver, Register13PageUI.DYNAMIC_FORM_REGISTER_TEXTBOX, values);
		sendkeyToElement(driver, Register13PageUI.DYNAMIC_FORM_REGISTER_TEXTBOX, value, values);
	}

	public void inputMiddleName(String middlename) {
		
	}

	public void inputLastName(String lastname) {
		
	}

	public void inputEmailAddress(String email) {
		
	}

	public void inputPassword(String pass) {
		
	}

	public void inputConfirmPassword(String confirmpass) {
		
	}

	public myDashBoard13PageObject clickRegisterButton() {
		waitToElementClickAble(driver, Register13PageUI.REGISTER_BUTTON);
		clickToElement(driver, Register13PageUI.REGISTER_BUTTON);
		return PageGeneratorManager.getmyDashBoardPage13(driver);
	}

}
