package scoreapp;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pageObjects.FavoriteLeaguesPage;
import pageObjects.HomePage;
            
public class ScoreTests  extends TestBase{

//	@Test
//	public void GetStarted() throws MalformedURLException
//	{
//		driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/btn_primary")).click();
//		String welcome = driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/txt_welcome")).getText();
//		Assert.assertEquals(welcome, "WELCOME");
//
//	}
	
//	@Test
//	public void ValidateHomePage() throws MalformedURLException
//	{
//		HomePage homePage = new HomePage(driver);
//		homePage.ValidateHomePage();
//
//		//Thread.sleep(2000);
//	}
	@Test
	public void NewTest() throws MalformedURLException
	{
		HomePage homePage = new HomePage(driver);
		FavoriteLeaguesPage leaguesPage = new FavoriteLeaguesPage(driver);
		homePage.getStarted();
		
		leaguesPage.selectLeagues("NFL Football");
		Assert.assertEquals(leaguesPage.nflIcon.getText(), "NFL");
		
		leaguesPage.selectLeagues("NASCAR Racing");
		Assert.assertEquals(leaguesPage.nascarIcon.getText(), "NASCAR");
		
//		leaguesPage.selectLeagues("WNBA Basketball");
//		Assert.assertEquals(leaguesPage.wnbaIcon.getText(), "WNBA");
//		
//		leaguesPage.selectLeagues("Formula 1 Racing");
//		Assert.assertEquals(leaguesPage.f1Icon.getText(), "F1");
		
		leaguesPage.continueButton.click();
		
		///NEXT TO CODE
		//Select a team - Pittsburgh Steelers
		//click continue
		//verify never miss a game is displayed
		//click done
		//verify favorites are displayed
		//click leagues
		//verify leagues is displayed
		//close quick tip
		//select mlb
		//verify MLB page displayed and TODAY is selected
		//select standings
		//verify staqndings are displayed
		//click back button
		//verify leagues is displayed
		//done
		//document in readme with markup
		
		
//continue
		
	}
	
//	@Test
//	public void CreateTeam() throws MalformedURLException, InterruptedException
//	{
//		HomePage homePage = new HomePage(driver);
//		FavoriteLeaguesPage leaguesPage = new FavoriteLeaguesPage(driver);
//		homePage.getStarted();
//		leaguesPage.selectLeagues("NFL Football");
//		Thread.sleep(2000);
//		leaguesPage.selectLeagues("Formula 1 Racing");
//
//	}
}

