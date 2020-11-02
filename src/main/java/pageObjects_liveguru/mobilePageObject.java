package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.mobilePageUI;

public class mobilePageObject extends AbstractPage{
	WebDriver driver;

	public mobilePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void selectSortName(String itemValue) {
		waitToElementVisible(driver, mobilePageUI.SORT_DROPDOWN);
		selectItemInDropdown(driver, mobilePageUI.SORT_DROPDOWN, itemValue);
	}

	public boolean isNameSortAscending() {
		waitToElementsVisible(driver, mobilePageUI.SORT_ASCENDING_NAME);
		return isDataSortedAscending(driver, mobilePageUI.SORT_ASCENDING_NAME);
	}

	
}
