package StockNotifier;

public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObservers(double oldPrice,double newPrice);
}
