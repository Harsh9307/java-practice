package StockNotifier;

public interface InvestmentStrategy {
    void evaluate(String stockName,double oldPrice,double newPrice);
}