Feature: Ordering dishes

  Scenario: Multiple Dishes Order
    Given Customer reads the menu
    When Orders the dishes
      | Dish                   | Quantity |
      | Spicy Meatballs        |        1 |
      | Fried Gnocchi          |        1 |
      | Margherita             |        1 |
      | Spaghetti Aglio E Olio |        1 |
      | Espresso               |        2 |
    Then Kitchen should receive the order
