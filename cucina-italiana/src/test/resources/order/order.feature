Feature: Ordering dishes

  Scenario: Multiple Dishes Order
    Given Customer reads the menu
    When Orders the dishes
      | Dish                   | Quantity |
      | Spicy Meatballs        |        2 |
      | Fried Gnocchi          |        2 |
      | Margherita             |        1 |
      | Neapolitan             |        1 |
      | Spaghetti Aglio E Olio |        1 |
      | Tagliatelle Bolognese  |        1 |
      | Tiramisu               |        3 |
      | Cannoli                |        1 |
      | Espresso               |        4 |
    Then Kitchen should receive the order
