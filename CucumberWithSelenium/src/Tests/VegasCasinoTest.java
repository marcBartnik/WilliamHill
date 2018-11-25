package Tests;

import org.junit.Test;
import VegasWilliamHillHomepage.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Tutaj beda wywolane metody z klasy Customer. Tam zostana zadeklarowane. Tutaj tylko je uzyjemy.
 */
public class VegasCasinoTest {
	Customer customer;
	
	@Test
	@Given("^Customer is on Vegas Casino home page$")
	public void customer_is_on_Vegas_Casino_home_page() throws Throwable {
		customer.isOnTheHomePage();
	}

	@Test
	@When("^Customer clicks magnifier button$")
	public void customer_clicks_magnifier_button() throws Throwable {
		customer.clickMagnifierButton();
	}

	@Test
	@When("^Customer enters Mayfair Roulette as a game name$")
	public void customer_enters_Mayfair_Roulette_as_a_game_name() throws Throwable {
		customer.enterGameName();
	}

	@Test
	@When("^Customer hovers over the Mayfair Roulette game title$")
	public void customer_hovers_over_the_Mayfair_Roulette_game_title() throws Throwable {
		customer.hoverOverGameTitle();
	}

	@Test
	@When("^Customer clicks More button$")
	public void customer_clicks_More_button() throws Throwable {
		customer.clickMoreButton();
	}

	@Test
	@When("^Customer clicks Play Now button$")
	public void customer_clicks_Play_Now_button() throws Throwable {
		customer.clickPlayNowButton();
	}

	@Test
	@Then("^Validate full Login Window is displayed$")
	public void validate_full_Login_Window_is_displayed() throws Throwable { 
		customer.validateFullLoginWindowIsDisplayed(); 
	}
}
