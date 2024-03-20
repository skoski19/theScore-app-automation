package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.AndroidActions;

public class HomePage extends AndroidActions {
	AndroidDriver driver;
	public HomePage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/icon_welcome")
	public WebElement scoreLogo;
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
	public WebElement getStartedButton;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/txt_app_exp")
	public WebElement welcomeText;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/txt_sign_in")
	public WebElement loginLink;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/txt_terms")
	public WebElement termsLink;

	
	public void validateHomePage()
	{
		Assert.assertTrue(scoreLogo.isDisplayed());
		Assert.assertTrue(welcomeText.isDisplayed());
		Assert.assertTrue(loginLink.isDisplayed());
		 Assert.assertTrue(getStartedButton.isDisplayed());
		 Assert.assertTrue(termsLink.isDisplayed());
	}

	public void getStarted()
	{
		getStartedButton.click();
	}
	
}
