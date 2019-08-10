package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuData {

	private static List<Dish> dishes = new ArrayList<>();

	public static List<Dish> getMenuData() {
		return new ArrayList<>(dishes);
	}

	static {
		dishes.add(new Dish("Fried Gnocchi", DishType.APPETIZER, 3.75f));
		dishes.add(new Dish("Spicy Meatballs", DishType.APPETIZER, 5.25f));
		dishes.add(new Dish("Chicken Milanese", DishType.APPETIZER, 4.75f));

		dishes.add(new Dish("Spaghetti Aglio E Olio", DishType.PASTA, 7.25f));
		dishes.add(new Dish("Sausage Pappardelle", DishType.PASTA, 9.75f));
		dishes.add(new Dish("Tagliatelle Bolognese", DishType.PASTA, 9.75f));

		dishes.add(new Dish("Margherita", DishType.PIZZA, 7.75f));
		dishes.add(new Dish("Chicken Alla Diavola", DishType.PIZZA, 9.75f));
		dishes.add(new Dish("Neapolitan", DishType.PIZZA, 8.25f));

		dishes.add(new Dish("Tiramisu", DishType.DESSERT, 4.50f));
		dishes.add(new Dish("Nocha Mousse", DishType.DESSERT, 4.25f));
		dishes.add(new Dish("Cannoli", DishType.DESSERT, 4.25f));

		dishes.add(new Dish("Espresso", DishType.BEVERAGE, 2.75f));
		dishes.add(new Dish("Macchiato", DishType.BEVERAGE, 2.75f));
		dishes.add(new Dish("Cappuccino", DishType.BEVERAGE, 2.75f));
	}
}
