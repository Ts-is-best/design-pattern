package PizzaStore;

import Pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            case "clam" -> new NyStyleClamPizza();
            case "pepperoni" -> new NyStylePepperoniPizza();
            default -> null;
        };
    }
}

class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

class NyStyleVeggiePizza extends Pizza {
}

class NyStyleClamPizza extends Pizza {
}

class NyStylePepperoniPizza extends Pizza {
}
