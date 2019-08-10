package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Dish> dishes = new ArrayList<>();

	public static Menu retrieveMenu() {
		Menu menu = new Menu();
		menu.dishes = MenuData.getMenuData();
		return menu;
	}
}
