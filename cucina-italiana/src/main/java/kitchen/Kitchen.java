package kitchen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import order.Order;

public class Kitchen {

	private static List<Order> orders = Collections.synchronizedList(new ArrayList<>());

	public static void acceptOrder(Order order) {
		orders.add(order);
	}

	public static Optional<Order> retrieveOrder(int id) {
		return orders.stream().filter(o -> o.getOrderId() == id).findAny();
	}
}
