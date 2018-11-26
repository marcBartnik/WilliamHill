package VegasWilliamHillHomepage;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

/*
 * Class provides methods for Customer to moving on a page.
 */
public class ViewsHomePage {
	private WebDriver driver;															//driver which allows navigation on web page
	private LocatorsHomePage locatorsHomePage;											//here are stored all needed element for performing action on home page
	private String vegasCasinoHomepage = HomePageData.getVegasCasinoHomepage(); 		//access to getter where Vegas Casino page url is stored
	private String vegasCasinoPageTitle = HomePageData.getVegasCasinoPageTitle();		//access to getter where Vegas Casino page title is stored
	
	/*
	 * Constructor
	 */
    public ViewsHomePage(WebDriver driver) {
    	this.driver = driver;
    	locatorsHomePage = new LocatorsHomePage(driver);
    }
    
    /*
     * Opening Vegas Casino home page and verification if it succeeded.
     */
    public void openHomePage() {
    	driver.get(vegasCasinoHomepage);
    	if (driver.getTitle().equals(vegasCasinoPageTitle))
    		throw new TimeoutException("There is no response from William Hill Vegas Casino! Url address is unreachable.");
    }
    
    /*
     * Methods which provides set of actions for Customer. Those actions can be made on Vegas Casino home page.
     */
    public void clickOnMagnifierButton() { locatorsHomePage.magnifierButton().click(); }
    
    public void clickOnSearchInputField() { locatorsHomePage.searchInputField().click(); }
    
    public void setGameName() { locatorsHomePage.searchInputField().sendKeys(HomePageData.getGameName()); }
    
    public void clickOnSearchButton() { locatorsHomePage.searchButton().click(); }
}