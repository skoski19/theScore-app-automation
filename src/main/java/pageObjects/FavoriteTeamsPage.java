package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;

public class FavoriteTeamsPage extends AndroidActions {
	public FavoriteTeamsPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/title_onboarding")
	public WebElement favoriteTeams;
	
	@AndroidFindBy(id="//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"PIT\"]")
	public WebElement pittsburghIcon;
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
	public WebElement continueButton;
	
	public void selectFavoriteTeam(String team)
	{
		scrollToText(team);		
	}
	
}

