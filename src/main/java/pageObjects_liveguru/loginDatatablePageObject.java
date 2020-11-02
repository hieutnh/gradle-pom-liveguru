package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageDataTableUI;

public class loginDatatablePageObject extends AbstractPage {
	WebDriver driver;

	public loginDatatablePageObject(WebDriver driver) {

		this.driver = driver;
	}

	public void inputUserNameTextBox(String username) {
		waitToElementVisible(driver, LoginPageDataTableUI.USERNAME_TEXTBOX);
		sendkeyToElement(driver, LoginPageDataTableUI.USERNAME_TEXTBOX, username);
		
	}

	public void inputPasswordTextBox(String pass) {
		waitToElementVisible(driver, LoginPageDataTableUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageDataTableUI.PASSWORD_TEXTBOX, pass);
	}

	//có th�? mang qua AbstractPage nếu b�? lặp lại nhiều lần
	public managerCustomersObject clickLoginButton() {
		waitToElementClickAble(driver, LoginPageDataTableUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageDataTableUI.LOGIN_BUTTON);
		return PageGeneratorManager.getmanagerCustomersPage(driver);

	}

}
