package NyStyle;

<<<<<<< HEAD
import Ingredient.NyPizzaIngredientFactory;
=======
>>>>>>> e5738bfe2db4557dd45f62351e266a4ea3f8acc5
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

