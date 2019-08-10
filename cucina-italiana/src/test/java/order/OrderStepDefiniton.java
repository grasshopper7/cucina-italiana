package order;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import actor.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kitchen.Kitchen;
import menu.Menu;

public class OrderStepDefiniton {
	
	private Customer customer;
	
	private int orderId;
	
	private Map<String, Integer> expectedDishDetails = new HashMap<>();

	@Given("Customer reads the menu")
	public void customer_reads_the_menu() {

		customer = new Customer(Menu.retrieveMenu());
	}

	@When("Orders the dishes")
	public void orders_the_dishes(io.cucumber.datatable.DataTable dataTable) {

		Map<String, Integer> dishDetails = dataTable.rows(1).asMap(String.class, Integer.class);
	    orderId = customer.orderDishes(dishDetails);
	    expectedDishDetails = new HashMap<>(dishDetails);
	}

	@Then("Kitchen should receive the order")
	public void kitchen_should_receive_the_order() {

		Order order = Kitchen.retrieveOrder(orderId);
	    
	    List<OrderLine> dishes = order.getDishes();
	    assertThat("num of dishes qty", dishes.size(), equalTo(expectedDishDetails.size()));
	    
	    dishes.forEach(ol -> {
	    	String actualDishName = ol.getDish().getName();
	    	
		    assertThat("dish name", true, equalTo(expectedDishDetails.containsKey(actualDishName)));
	    	assertThat("dish qty", ol.getQuantity(), equalTo(expectedDishDetails.get(actualDishName)));
	    });
	}
}
