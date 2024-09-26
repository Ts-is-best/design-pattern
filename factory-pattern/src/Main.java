import Pizza.Pizza;
import PizzaStore.PizzaStore;
import PizzaStore.NYPPizzaStore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println(pizza);
    }
}