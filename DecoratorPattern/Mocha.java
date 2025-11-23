package DecoratorPattern;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += 0.20;
                break;

            case GRANDE:
                cost += 0.25;
                break;

            case VENTI:
                cost += 0.30;
                break;
        }
        return cost;
    }
}
