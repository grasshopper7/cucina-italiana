package order;

import java.util.ArrayList;
import java.util.List;

import menu.Dish;

public class Order {
	
	private List<OrderLine> items = new ArrayList<>();
	private int orderId; 
	
	public Order() {
		orderId = OrderIdGenerator.nextId();
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public List<OrderLine> getDishes() {
		return new ArrayList<>(items);
	}
	
	public void addDishToOrder(Dish dish, int qty) {
		items.add(new OrderLine(dish, qty));
	}
	
	private static class OrderIdGenerator {
		
		private static int id = 999;
		
		private static int nextId() {
			id = id + 1;
			return id;
		}
	}
}


