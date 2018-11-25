package VegasWilliamHillHomepage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Tutaj beda zadeklarowane metody do poruszania sie po stronie. Wywolamy je w klasie VegasCasinoTest
 * To inaczej Wave7000Server
 */
public class Customer {
	
	private WebDriver driver;
	private final String chromeDriverPath = new File("..//src//resources//chromedriver.exe").getAbsolutePath();
	private ViewsHomePage viewsHomePage;
    private ViewsSearchResultPage viewsSearchResultPage;

    
	public Customer() {}

    public void startSession(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        viewsHomePage = new ViewsHomePage(driver);
        viewsSearchResultPage = new ViewsSearchResultPage();
    }

    public void quitSession() { driver.close(); }
	
	public void isOnTheHomePage() { viewsHomePage.openHomePage(); }

	public void clickMagnifierButton() { viewsHomePage.clickOnMagnifierButton(); }

	public void enterGameName() {
		viewsHomePage.setGameName();
		viewsHomePage.clickOnSearchButton();
	}
	
	public void hoverOverGameTitle() throws InterruptedException { viewsSearchResultPage.hoverOverGame(); }

	public void clickMoreButton() { viewsSearchResultPage.clickMoreButton(); }

	public void clickPlayNowButton() { viewsSearchResultPage.clickPlayNowButton(); }

	public void validateFullLoginWindowIsDisplayed() { viewsSearchResultPage.checkIfLoginFormIsPresent(); }
}
