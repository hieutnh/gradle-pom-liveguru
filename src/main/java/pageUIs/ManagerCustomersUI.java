package pageUIs;

public class ManagerCustomersUI {

	public static final String POPUP_BUTTON = "//span[contains(text(),'close')]";
	public static final String DYNAMIC_HEADER_COLUMNNAME = "//span[text()='%s']//ancestor::th//preceding-sibling::th";
	public static final String DYNAMIC_TEXTBOX_INDEX_COLUMNNAME = "//tr[@class='filter']/th[%s]//input";
	public static final String DYNAMIC_BUTTON_SEARCH = "//span[text()='%s']/ancestor::button";
	public static final String DYNAMIC_VALUE_AT_SOME_COLUMN = "//tr[%s]//td[%s][contains(text(),'%s')]";
	public static final String DROPDOWN_COUNTRY = "//select[@id='customerGrid_filter_billing_country_id']";
	public static final String LOADING = "//div[@id='loading-mask']";

	public static final String ALL_ELEMENT_IS_VIETNAM = "//td[contains(text(),'Vietnam')]//ancestor::tr";
	public static final String ALL_ROW_VIETNAM = "//table[@id='customerGrid_table']//tbody//tr";
	public static final String ALL_COLUMN_VIETNAM = "//table[@id='customerGrid_table']//tbody//tr[1]//th";
	public static final String ALL_COLUMNANDROW_VIETNAM = "//table[@id='customerGrid_table']//tbody//tr[\" + i + \"]//td[7]";

}
