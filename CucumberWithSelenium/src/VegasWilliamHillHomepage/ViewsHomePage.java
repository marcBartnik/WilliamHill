package VegasWilliamHillHomepage;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class ViewsHomePage {
	private WebDriver driver;
	private LocatorsHomePage locatorsHomePage;
	private String vegasCasinoHomepage = HomePageData.getVegasCasinoHomepage(); 
	private String vegasCasinoPageTitle = HomePageData.getVegasCasinoPageTitle();
	
    public ViewsHomePage(WebDriver driver) {
    	this.driver = driver;
    	locatorsHomePage = new LocatorsHomePage(driver);
    }
    
    public void openHomePage() {
    	driver.get(vegasCasinoHomepage);
    	if (driver.getTitle().equals(vegasCasinoPageTitle))
    		throw new TimeoutException("There is no response from William Hill Vegas Casino! Url address is unreachable.");
    }
    
    public void clickOnMagnifierButton() { locatorsHomePage.magnifierButton().click(); }
    
    public void clickOnSearchInputField() { locatorsHomePage.searchInputField().click(); }
    
    public void setGameName() { locatorsHomePage.searchInputField().sendKeys(HomePageData.getGameName()); }
    
    public void clickOnSearchButton() { locatorsHomePage.searchButton().click(); }
}