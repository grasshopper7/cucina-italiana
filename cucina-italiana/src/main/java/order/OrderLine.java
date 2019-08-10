package order;

import menu.Dish;

public class OrderLine {

	private Dish dish;	
	private int quantity;
	
	public OrderLine() {}

	public OrderLine(Dish dish, int quantity) {
		this.dish = dish;
		this.quantity = quantity;
	}
}
