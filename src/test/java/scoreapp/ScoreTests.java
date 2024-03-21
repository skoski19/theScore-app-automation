package scoreapp;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FavoriteLeaguesPage;
import pageObjects.FavoriteTeamsPage;
import pageObjects.FavoritesPage;
import pageObjects.HomePage;
import pageObjects.LeaguesPage;

import pageObjects.NeverMissGamePage;

            
public class ScoreTests  extends TestBase
{

	@Test
	public void SelectLeagueTeamValidateStandings() throws MalformedURLException
	{
		HomePage homePage = new HomePage(driver);
		FavoriteLeaguesPage leaguesPage = new FavoriteLeaguesPage(driver);
		FavoriteTeamsPage teamsPage = new FavoriteTeamsPage(driver);
		NeverMissGamePage gamePage = new NeverMissGamePage(driver);
		FavoritesPage favPage = new FavoritesPage(driver);
		LeaguesPage leaguePage = new LeaguesPage(driver);
		
		homePage.getStarted();
		
		leaguesPage.selectLeagues("NFL Football");
		Assert.assertEquals(leaguesPage.nflIcon.getText(), "NFL");
		
		leaguesPage.selectLeagues("NASCAR Racing");
		Assert.assertEquals(leaguesPage.nascarIcon.getText(), "NASCAR");
		
		leaguesPage.continueButton.click();
	
		Assert.assertEquals(teamsPage.favoriteTeams.getText(), "Choose your favorite teams");
		
		teamsPage.continueButton.click();
		
		Assert.assertEquals(gamePage.missGame.getText(), "Never miss a game");
		
		gamePage.doneButton.click();
		
		Assert.assertTrue(favPage.favorites.isSelected());
		
		favPage.leagues.click();
		
		leaguePage.selectMLBLeagues();
		
		Assert.assertTrue(leaguePage.scores.isSelected());
		
		leaguePage.standings.click();
		
		Assert.assertTrue(leaguePage.standings.isSelected());
		
		Assert.assertTrue(leaguePage.cactus.isSelected());
		
		leaguePage.backButton.click();
		
		Assert.assertTrue(leaguePage.leaguesTitlePage.isDisplayed());	
	}
}

