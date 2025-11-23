package StockNotifier;

public class ConservativeStrategy implements InvestmentStrategy {
    public void evaluate(String stockName, double oldPrice, double newPrice) {
        if (newPrice < oldPrice * 0.95) {
            System.out.println("[Conservative] Buying " + stockName + " at " + newPrice);
        }
    }
}
