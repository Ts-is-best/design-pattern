package PizzaFactory;

import Pizza.CheesePizza;
import Pizza.GreekPizza;
import Pizza.PepperoniPizza;
import Pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
