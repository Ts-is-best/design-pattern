package starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return 0.79;
    }
}
