package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;


public class LeaguesPage extends AndroidActions {
	AndroidDriver driver;
	
	public LeaguesPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Scores\"]")
	public WebElement scores;
	
	@AndroidFindBy(accessibility="Standings")
	public WebElement standings;
	
	@AndroidFindBy(accessibility="Navigate up")
	public WebElement backButton;
	
	@AndroidFindBy(accessibility="Cactus")
	public WebElement cactus;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/titleTextView")
	public WebElement leaguesTitlePage;
	
	
	public void selectMLBLeagues()
	{
		scrollToText("MLB");		
	}
}
