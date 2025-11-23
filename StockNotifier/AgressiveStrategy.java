package StockNotifier;

public class AgressiveStrategy implements InvestmentStrategy {
    public void evaluate(String stockName, double oldPrice, double newPrice) {
        if (newPrice < oldPrice) {
            System.out.println("[Aggressive] Buying " + stockName + " at " + newPrice);
        }
    }
}
