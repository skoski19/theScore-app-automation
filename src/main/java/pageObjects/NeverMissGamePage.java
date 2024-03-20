package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;

public class NeverMissGamePage extends AndroidActions {
	public NeverMissGamePage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/title_onboarding")
	public WebElement missGame;
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
	public WebElement doneButton;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/grant_singleton")
	public WebElement notificationPopup;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement allowButton;
	
	
	public void dismissNotificationPopUp()
	{
		if(notificationPopup.isDisplayed())
		{
			allowButton.click();
		}
	}
	
}