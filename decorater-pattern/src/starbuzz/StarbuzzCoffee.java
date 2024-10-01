package starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        Beverage beverage2 = new Mocha(beverage1);
        Beverage beverage3 = new Mocha(beverage2);

        System.out.println(beverage1.getDescription() + " $" + beverage1.getFormattedCost());
        System.out.println(beverage2.getDescription() + " $" + beverage2.getFormattedCost());
        System.out.println(beverage3.getDescription() + " $" + beverage3.getFormattedCost());
    }
}
