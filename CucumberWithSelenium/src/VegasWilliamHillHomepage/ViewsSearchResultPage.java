package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
 * Class provides methods for Customer to moving on a page with game searching results.
 */
public class ViewsSearchResultPage {
	private WebDriver driver;                                     //driver which allows navigation on web page
	private Actions actions;                                      //class Actions for performing hover over tiles
	private LocatorSearchResultPage locatorSearchResultPage;      //here are stored all needed element for performing actions on page
	
	
	public ViewsSearchResultPage() {}
	
	/*
	 * hover over game tile.
	 */
	public void hoverOverGame() throws InterruptedException {
		WebElement gameToHoverOver = locatorSearchResultPage.game();
		actions.moveToElement(gameToHoverOver);
		driver.wait(10);
	}
	
	/*
	 * Clicking "More" button.
	 */
	public void clickMoreButton() { locatorSearchResultPage.moreButton().click(); }
	
	/*
	 * Clicking "Play Now" button.
	 */
	public void clickPlayNowButton() { locatorSearchResultPage.playNowButton().click(); }
	
	/*
	 * Validation if login form is present.
	 */
	public Boolean checkIfLoginFormIsPresent() {
		try {
			driver.findElements((By) locatorSearchResultPage.loginForm());
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;	
	}
}