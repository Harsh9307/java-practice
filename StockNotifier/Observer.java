package StockNotifier;

public interface Observer {
    public void update(String stockName, double oldPrice, double newPrice);
}
