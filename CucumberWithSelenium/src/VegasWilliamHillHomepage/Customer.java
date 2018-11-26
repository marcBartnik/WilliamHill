package VegasWilliamHillHomepage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Class Customer is an Actor who will be performing actions on Vegas Casino page.
 */
public class Customer {
	
	private WebDriver driver;
	private final String chromeDriverPath = new File("..//src//resources//chromedriver.exe").getAbsolutePath();
	private ViewsHomePage viewsHomePage;
    private ViewsSearchResultPage viewsSearchResultPage;

    
	public Customer() {}   //default constructor

	/*
	 * setting up environment for using Chrome driver.
	 */
    public void startSession(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        viewsHomePage = new ViewsHomePage(driver);
        viewsSearchResultPage = new ViewsSearchResultPage();
    }

    /*
     * cleaning up environment after tests.
     */
    public void quitSession() { driver.close(); }
	
    /*
     * Opening Vegas Casino home page and validation if it succeeded.
     */
	public void isOnTheHomePage() { viewsHomePage.openHomePage(); }

	/*
	 * Clicking on magnifier button to enable looking for specified game.
	 */
	public void clickMagnifierButton() { viewsHomePage.clickOnMagnifierButton(); }

	/*
	 * Typing requested game name into search field and clicking search button.
	 */
	public void enterGameName() {
		viewsHomePage.setGameName();
		viewsHomePage.clickOnSearchButton();
	}
	
	/*
	 * Mouse pointer is moved onto game tile.
	 */
	public void hoverOverGameTitle() throws InterruptedException { viewsSearchResultPage.hoverOverGame(); }

	/*
	 * Clicking "More" button
	 */
	public void clickMoreButton() { viewsSearchResultPage.clickMoreButton(); }

	/*
	 * Clicking "Play Now" button
	 */
	public void clickPlayNowButton() { viewsSearchResultPage.clickPlayNowButton(); }

	/*
	 * Validation if login form is displayed
	 */
	public void validateFullLoginWindowIsDisplayed() { viewsSearchResultPage.checkIfLoginFormIsPresent(); }
}
