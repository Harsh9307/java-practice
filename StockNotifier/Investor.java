package StockNotifier;

public class Investor implements Observer {
    private String name;
    private InvestmentStrategy strategy;

    public Investor(String name, InvestmentStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void update(String stockName, double oldPrice, double newPrice) {
        System.out.println(name + " got update: " + stockName + " changed from " + oldPrice + " to " + newPrice);
        strategy.evaluate(stockName, oldPrice, newPrice);
    }

}
