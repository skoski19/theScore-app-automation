package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;

public class FavoriteLeaguesPage extends AndroidActions {
	AndroidDriver driver;
	
	public FavoriteLeaguesPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/title_onboarding")
	public WebElement chooseLeagues;
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
	public WebElement continueButton;

	@AndroidFindBy(id = "com.fivemobile.thescore:id/recyclerView")
	public WebElement leagueList;
	
	
	public void selectLeagues(String league)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+league+"\").instance(0))")).click();
		
	}
}
