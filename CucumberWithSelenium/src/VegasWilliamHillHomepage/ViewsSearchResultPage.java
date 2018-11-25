package VegasWilliamHillHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ViewsSearchResultPage {
	private WebDriver driver;
	private Actions actions;
	private LocatorSearchResultPage locatorSearchResultPage;
	
	
	public ViewsSearchResultPage() {}
	
	public void hoverOverGame() throws InterruptedException {
		WebElement gameToHoverOver = locatorSearchResultPage.game();
		actions.moveToElement(gameToHoverOver);
		driver.wait(10);
	}
	
	public void clickMoreButton() { locatorSearchResultPage.moreButton().click(); }
	
	public void clickPlayNowButton() { locatorSearchResultPage.playNowButton().click(); }
	
	public Boolean checkIfLoginFormIsPresent() {
		try {
			driver.findElements((By) locatorSearchResultPage.loginForm());
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
		
	}
	
}