package PizzaStore;

import Pizza.Pizza;

public class NYPPizzaStore extends PizzaStore {
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
}

class NyStyleVeggiePizza extends Pizza {
}

class NyStyleClamPizza extends Pizza {
}

class NyStylePepperoniPizza extends Pizza {
}
