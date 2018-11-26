package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Class stores web page elements needed for running tests
 */
public class LocatorSearchResultPage {
	
	private WebDriver driver;				//driver which allows to navigate on web page
    private By gameLocator;					//game tiles on search result page
    private By moreButtonLocator;			//more button connected with requested game
    private By playNowButtonLocator;		//play now button which allows to play on a game
    private By loginFormLocator;			//login form if customer is not logged in

    public LocatorSearchResultPage(WebDriver driver){
        this.driver = driver;
        /*
         * web element representatives on a page
         */
        gameLocator = new By.ByLinkText("https://cmscdn.staticcache.org/assets/image/0009/800739/UKDESIGN-1216_214x214-MayfairRoulette-SquareTiles.jpg");
        moreButtonLocator = new By.ByClassName("sc-ifAKCX ixOsdk");
        playNowButtonLocator = new By.ByClassName("signinButton");
        loginFormLocator = new By.ByClassName("login-component__wrapper");
    }

    /*
     *methods for reaching particular elements 
     */
    public WebElement game() { return driver.findElement(gameLocator); }

    public WebElement moreButton() { return driver.findElement(moreButtonLocator); }

    public WebElement playNowButton() { return driver.findElement(playNowButtonLocator); }
    
    public WebElement loginForm() { return driver.findElement(loginFormLocator); }

}
