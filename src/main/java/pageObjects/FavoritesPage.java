package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;

public class FavoritesPage extends AndroidActions {
	AndroidDriver driver;
	
	public FavoritesPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/navigation_news")
	public WebElement news;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/navigation_scores")
	public WebElement scores;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/navigation_favorites")
	public WebElement favorites;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/navigation_discover")
	public WebElement discover;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/navigation_leagues")
	public WebElement leagues;
	

	//android.widget.TextView[@resource-id="com.fivemobile.thescore:id/navigation_bar_item_small_label_view" and @text="Favorites"]
}