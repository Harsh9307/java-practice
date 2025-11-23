package StockNotifier;

public class StockNotifier {
    public static void main(String[] args) {
        Stock tesla = new Stock("TSLA", 1000);

        Investor i1 = new Investor("Harsh", new AgressiveStrategy());
        Investor i2 = new Investor("Riya", new ConservativeStrategy());

        tesla.registerObserver(i1);
        tesla.registerObserver(i2);

        tesla.setPrice(990);
        tesla.setPrice(940);
    }
}
