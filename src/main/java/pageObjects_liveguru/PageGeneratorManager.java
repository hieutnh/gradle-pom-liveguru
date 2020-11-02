package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static loginDatatablePageObject getLoginDataTablePage(WebDriver driver) {
		return new loginDatatablePageObject(driver);
	}

	public static managerCustomersObject getmanagerCustomersPage(WebDriver driver) {
		return new managerCustomersObject(driver);
	}
	
	public static loginUndisplayPageObject getLoginUndisplayPage(WebDriver driver) {
		return new loginUndisplayPageObject(driver);
	}
	
	public static tvPageObject getTvPage(WebDriver driver) {
		return new tvPageObject(driver);
	}
	
	public static home13PageObject getHomePage13(WebDriver driver) {
		return new home13PageObject(driver);
	}
	
	public static myDashBoard13PageObject getmyDashBoardPage13(WebDriver driver) {
		return new myDashBoard13PageObject(driver);
	}
	
	public static register13PageObject getregisterPage13(WebDriver driver) {
		return new register13PageObject(driver);
	}
	
	public static myOrders13PageObject getMyOrderPage13(WebDriver driver) {
		return new myOrders13PageObject(driver);
	}
	
	public static myWishlist13PageObject getMyWishlist13Page(WebDriver driver) {
		return new myWishlist13PageObject(driver);
	}
	
	public static addressBook13PageObject getAddressBook13Page(WebDriver driver) {
		return new addressBook13PageObject(driver);
	}

	public static myApplications13PageObject getmyApplications13Page(WebDriver driver) {
		return new myApplications13PageObject(driver);
	}
	
	public static loginPageObject13 getLoginPage13(WebDriver driver) {
		return new loginPageObject13(driver);
	}
	
	public static mobilePageObject getmobilePage(WebDriver driver) {
		return new mobilePageObject(driver);
	}

}
