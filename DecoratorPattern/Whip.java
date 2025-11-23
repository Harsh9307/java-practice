package DecoratorPattern;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }
    public double cost(){
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost+=0.10;
                break;
        
            case GRANDE:
                cost+=0.15;
                break;
            
            case VENTI:
                cost+=0.20;
                break;
        }
        return cost;
    }
}
