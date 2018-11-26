package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import VegasWilliamHillHomepage.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Class calls all methods from class Customer.
 */
public class VegasCasinoTest {
	Customer customer;
	
	/*
	 * Setting up environment.
	 */
	@BeforeClass
	public void setUp() {
		customer.startSession();
	}
	
	/*
	 * Cleaning up.
	 */
	@AfterClass
	public void tearDown() {
		customer.quitSession();
	}
	/*
	 * Hereby are all implemented steps from scenario.
	 */
	@Test
	@Given("^Customer is on Vegas Casino home page$")
	public void customer_is_on_Vegas_Casino_home_page(){
		customer.isOnTheHomePage();
	}

	@Test
	@When("^Customer clicks magnifier button$")
	public void customer_clicks_magnifier_button(){
		customer.clickMagnifierButton();
	}

	@Test
	@When("^Customer enters Mayfair Roulette as a game name$")
	public void customer_enters_Mayfair_Roulette_as_a_game_name(){
		customer.enterGameName();
	}

	@Test
	@When("^Customer hovers over the Mayfair Roulette game title$")
	public void customer_hovers_over_the_Mayfair_Roulette_game_title() throws InterruptedException{
		customer.hoverOverGameTitle();
	}

	@Test
	@When("^Customer clicks More button$")
	public void customer_clicks_More_button(){
		customer.clickMoreButton();
	}

	@Test
	@When("^Customer clicks Play Now button$")
	public void customer_clicks_Play_Now_button(){
		customer.clickPlayNowButton();
	}

	@Test
	@Then("^Validate full Login Window is displayed$")
	public void validate_full_Login_Window_is_displayed(){ 
		customer.validateFullLoginWindowIsDisplayed();
	}
}
