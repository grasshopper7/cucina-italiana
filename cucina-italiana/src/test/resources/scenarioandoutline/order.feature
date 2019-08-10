Feature: Ordering dishes

  Scenario: Multiple Dishes Order
    Given Customer reads the menu
    When Orders the dishes
      | Dish            | Quantity |
      | Spicy Meatballs |        2 |
      | Margherita      |        1 |
      | Neapolitan      |        1 |
    Then Kitchen should receive the order
