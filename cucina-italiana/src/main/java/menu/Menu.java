package menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import menu.Dish;

public class Menu {

	private List<Dish> dishes = new ArrayList<>();

	public static Menu retrieveMenu() {

		Menu menu = new Menu();
		menu.dishes = MenuData.getMenuData();
		return menu;
	}

	public Dish retrieveDishByName(String name) {

		dishes.sort(Dish.compareDishByName());
		int itemIndex = Collections.binarySearch(dishes, new Dish(name), Dish.compareDishByName());
		return dishes.get(itemIndex);
	}
}
