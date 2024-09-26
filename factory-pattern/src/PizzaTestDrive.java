import Pizza.Pizza;
import PizzaStore.PizzaStore;
import PizzaStore.NYStylePizzaStore;
import PizzaStore.ChicagoStylePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");

        System.out.println("Ethan ordered " + pizza1.getName());

        Pizza pizza2 = chicagoStore.orderPizza("cheese");

        System.out.println("Joel ordered " + pizza2.getName());
    }
}