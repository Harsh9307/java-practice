package StockNotifier;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void setPrice(double newPrice) {
        double oldPrice = this.price;
        this.price = newPrice;
        notifyObservers(oldPrice, newPrice);
    }
    public void notifyObservers(double oldPrice, double newPrice) {
        for (Observer o : observers)
            o.update(name, oldPrice, newPrice);
    }
        
}
