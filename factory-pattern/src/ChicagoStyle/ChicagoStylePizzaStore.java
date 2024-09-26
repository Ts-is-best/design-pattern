package ChicagoStyle;

import Pizza.CheesePizza;
import Pizza.GreekPizza;
import Pizza.PepperoniPizza;
import Pizza.Pizza;
import PizzaFactory.PizzaIngredientFactory;
import PizzaStore.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        switch (item) {
            case "cheese":
                Pizza cheesePizza = new CheesePizza(ingredientFactory);
                cheesePizza.setName("Chicago Style Deep Dish Cheese Pizza");
                return cheesePizza;
            case "greek":
                Pizza greekPizza = new GreekPizza(ingredientFactory);
                greekPizza.setName("Chicago Style Deep Dish Cheese Pizza");
                return greekPizza;
            case "pepperoni":
                Pizza pepperoniPizza = new PepperoniPizza(ingredientFactory);
                pepperoniPizza.setName("Chicago Style Deep Dish Cheese Pizza");
                return pepperoniPizza;
            default:
                return null;
        }
    }
}
