package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ManagerCustomersUI;

public class managerCustomersObject extends AbstractPage {
	WebDriver driver;

	public managerCustomersObject(WebDriver driver) {

		this.driver = driver;
	}

	public void clickToClosePopupIncoming() {
		waitToElementClickAble(driver, ManagerCustomersUI.POPUP_BUTTON);
		clickToElement(driver, ManagerCustomersUI.POPUP_BUTTON);

	}

	public void inputManagerCustomerTableColumnName(String locatorColumnName, String value) {
		// get ra locator của column
		waitToElementVisible(driver, ManagerCustomersUI.DYNAMIC_HEADER_COLUMNNAME, locatorColumnName);
		// String.valueof chuyển hàm int qua String
		// xác định vị trí index của locator mình muốn tìm trong column trên
		String countElementGetIndex = String.valueOf(countElementSize(driver, ManagerCustomersUI.DYNAMIC_HEADER_COLUMNNAME, locatorColumnName) + 1);
		waitToElementVisible(driver, ManagerCustomersUI.DYNAMIC_TEXTBOX_INDEX_COLUMNNAME, countElementGetIndex);
		sendkeyToElement(driver, ManagerCustomersUI.DYNAMIC_TEXTBOX_INDEX_COLUMNNAME, value, countElementGetIndex);
	}

	public void clickSearchDataButton(String locator) {
		waitToElementClickAble(driver, ManagerCustomersUI.DYNAMIC_BUTTON_SEARCH, locator);
		clickToElement(driver, ManagerCustomersUI.DYNAMIC_BUTTON_SEARCH, locator);

	}

	public void selectItemToListCountry(String locatorColumnName, String itemValue) {
		waitToElementVisible(driver, ManagerCustomersUI.DROPDOWN_COUNTRY);
		selectItemInDropdown(driver, ManagerCustomersUI.DROPDOWN_COUNTRY, itemValue);

	}

	public void loadingDisable() {
		waitToElementInvisible(driver, ManagerCustomersUI.LOADING);

	}

	public boolean isDisplayData(String locatorColumnName, String value, String rowNumber) {
		waitToElementVisible(driver, ManagerCustomersUI.DYNAMIC_HEADER_COLUMNNAME, locatorColumnName);
		String countElementGetIndex = String.valueOf(countElementSize(driver, ManagerCustomersUI.DYNAMIC_HEADER_COLUMNNAME, locatorColumnName) + 1);
		waitToElementVisible(driver, ManagerCustomersUI.DYNAMIC_VALUE_AT_SOME_COLUMN, rowNumber, countElementGetIndex, value);
		return isElementDisplayed(driver, ManagerCustomersUI.DYNAMIC_VALUE_AT_SOME_COLUMN, rowNumber, countElementGetIndex, value);
	}

}
