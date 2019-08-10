package menu;

import java.util.Comparator;

public class Dish {

	private String name;
	private DishType type;
	private float price;

	public Dish(String name) {
		this(name, null, 0.0f);
	}

	public Dish(String name, DishType type, float price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public DishType getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

	public static Comparator<Dish> compareDishByName() {

		return new Comparator<Dish>() {
			@Override
			public int compare(Dish dish1, Dish dish2) {
				return dish1.name.compareTo(dish2.name);
			}
		};
	}
}
