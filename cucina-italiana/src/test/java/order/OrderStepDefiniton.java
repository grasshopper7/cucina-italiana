package order;

import actor.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import menu.Menu;

public class OrderStepDefiniton {

	@Given("Customer reads the menu")
	public void customer_reads_the_menu() {

		Customer customer = new Customer(Menu.retrieveMenu());
	}

	@When("Orders the dishes")
	public void orders_the_dishes(io.cucumber.datatable.DataTable dataTable) {

		throw new cucumber.api.PendingException();
	}

	@Then("Kitchen should receive the order")
	public void kitchen_should_receive_the_order() {

		throw new cucumber.api.PendingException();
	}
}
