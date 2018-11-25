package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Stad zaczynamy kodowac. Musimy opisac przyciski na glownej stronie. Beda one potem zaciagane przez ViewsHomePage i tam zostana opisane metody z nimi
 */
public class LocatorsHomePage {
    private WebDriver driver;

    private By magnifierButtonLocator;
    private By searchInputFieldLocator;
    private By searchButtonLocator;

    public LocatorsHomePage(WebDriver driver){
        this.driver = driver;

        magnifierButtonLocator = new By.ByClassName("btn-search-magnifier");
        searchInputFieldLocator = new By.ByClassName("sc-dxgOiQ cHTTOm");
        searchButtonLocator = new By.ByClassName("fa fa-search sc-jKJlTe bmGhbU");
    }

    public WebElement magnifierButton() { return driver.findElement(magnifierButtonLocator); }

    public WebElement searchInputField() { return  driver.findElement(searchInputFieldLocator); }

    public WebElement searchButton() { return driver.findElement(searchButtonLocator); }
}
