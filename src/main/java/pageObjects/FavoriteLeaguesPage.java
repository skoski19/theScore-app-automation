package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/icon")
	public WebElement favoriteIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"NASCAR\"]")
	public WebElement nascarIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"NFL\"]")
	public WebElement nflIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"F1\"]")
	public WebElement f1Icon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"WNBA\"]")
	public WebElement wnbaIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"WNBA\"]")
	public WebElement tailoredContent;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/btn_disallow")
	public WebElement maybeLaterButton;
	
	
	public void dismissPopUp()
	{
		if(tailoredContent.isDisplayed())
		{
			maybeLaterButton.click();
		}
	}

	public void selectLeagues(String league)
	{
		scrollToText(league);		
	}
}
