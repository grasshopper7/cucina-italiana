package actor;

import java.util.Map;

import kitchen.Kitchen;
import menu.Dish;
import menu.Menu;
import order.Order;

public class Customer {

	private Menu menu;

	public Customer() {
	}

	public Customer(Menu menu) {
		this.menu = menu;
	}

	public int orderDishes(Map<String, Integer> dishDetails) {
		return createOrder(dishDetails);
	}

	private int createOrder(Map<String, Integer> dishDetails) {

		Order order = new Order();
		dishDetails.forEach((name, qty) -> {
			Dish dish = menu.retrieveDishByName(name);
			order.addDishToOrder(dish, qty);
		});

		Kitchen.acceptOrder(order);
		return order.getOrderId();
	}
}
