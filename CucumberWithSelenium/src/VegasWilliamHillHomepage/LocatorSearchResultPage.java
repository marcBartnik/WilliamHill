package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorSearchResultPage {
	
	private WebDriver driver;
    private By gameLocator;
    private By moreButtonLocator;
    private By playNowButtonLocator;
    private By loginFormLocator;

    public LocatorSearchResultPage(WebDriver driver){
        this.driver = driver;

        gameLocator = new By.ByLinkText("https://cmscdn.staticcache.org/assets/image/0009/800739/UKDESIGN-1216_214x214-MayfairRoulette-SquareTiles.jpg");
        moreButtonLocator = new By.ByClassName("sc-ifAKCX ixOsdk");
        playNowButtonLocator = new By.ByClassName("signinButton");
        loginFormLocator = new By.ByClassName("login-component__wrapper");
    }

    public WebElement game() { return driver.findElement(gameLocator); }

    public WebElement moreButton() { return driver.findElement(moreButtonLocator); }

    public WebElement playNowButton() { return driver.findElement(playNowButtonLocator); }
    
    public WebElement loginForm() { return driver.findElement(loginFormLocator); }

}
