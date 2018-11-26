package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Class stores web page elements needed for running tests.
 */
public class LocatorsHomePage {
    private WebDriver driver;					//driver which allows navigation on web page

    private By magnifierButtonLocator;			//magnifier button
    private By searchInputFieldLocator;			//field where customer can type requested game name
    private By searchButtonLocator;				//button which runs searching for particular game

    public LocatorsHomePage(WebDriver driver){
        this.driver = driver;
        /*
         * web element representatives on a page
         */
        magnifierButtonLocator = new By.ByClassName("btn-search-magnifier");
        searchInputFieldLocator = new By.ByClassName("sc-dxgOiQ cHTTOm");
        searchButtonLocator = new By.ByClassName("fa fa-search sc-jKJlTe bmGhbU");
    }
    
    /*
     *methods for reaching particular elements
     */
    public WebElement magnifierButton() { return driver.findElement(magnifierButtonLocator); }

    public WebElement searchInputField() { return  driver.findElement(searchInputFieldLocator); }

    public WebElement searchButton() { return driver.findElement(searchButtonLocator); }
}
