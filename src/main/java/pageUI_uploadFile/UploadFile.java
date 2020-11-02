package pageUI_uploadFile;

public class UploadFile {
	public static final String DYNAMIC_FILE_LOADED_TEXT ="//p[@class='name' and text()='%s']";
	public static final String DYNAMIC_START_BUTTON = DYNAMIC_FILE_LOADED_TEXT + "//parent::td//following-sibling::td//button[contains(@class,'start')]";
	public static final String DYNAMIC_FILE_LOADED_LINK = "//p[@class='name']//a[@title='%s']";
	
	
}
