package PaymentProcessingSystem;

public class CryptoPayment implements PaymentBehavior {
    public static final int transactionFees = 1;
    public void pay(int amount) {
        System.out.println("Paying with Crypto: " + "$" + amount);
        System.out.println("Deducting transcation fees of: $"+CryptoPayment.transactionFees);
    }
}
