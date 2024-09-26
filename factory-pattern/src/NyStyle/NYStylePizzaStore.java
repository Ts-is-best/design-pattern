package NyStyle;

import Pizza.CheesePizza;
import Pizza.GreekPizza;
import Pizza.PepperoniPizza;
import Pizza.Pizza;
import PizzaFactory.PizzaIngredientFactory;
import PizzaStore.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                Pizza cheesePizza = new CheesePizza(ingredientFactory);
                cheesePizza.setName("NY Style Sauce and Cheese Pizza");
                return cheesePizza;
            case "greek":
                Pizza greekPizza = new GreekPizza(ingredientFactory);
                greekPizza.setName("NY Style Greek Pizza");
                return greekPizza;
            case "pepperoni":
                Pizza pepperoniPizza = new PepperoniPizza(ingredientFactory);
                pepperoniPizza.setName("NY Style Pepperoni Pizza");
                return pepperoniPizza;
            default:
                return null;
        }
    }
}

