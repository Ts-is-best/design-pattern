package starbuzz;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String getFormattedCost() {
        return String.format("%.2f", cost());
    }
}