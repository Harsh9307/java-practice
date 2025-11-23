package FactoryPattern;

public class ChicagoPizzaIngridientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Spinach(),new EggPlant(),BlackOlives()};
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clams createClams(){
        return new FrozenClams();
    }
}
