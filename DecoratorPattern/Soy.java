package DecoratorPattern;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ",Soy";
    }
    public double cost(){
        double cost = beverage.cost();
        switch(beverage.getSize()){
            case TALL:
                cost+=0.10;
            case GRANDE:
                cost+=0.15;
            case VENTI:
                cost+=0.20;
        } 
        return cost;
    }
}
