package PaymentProcessingSystem;

public class CreditCardPayment implements PaymentBehavior {
    public static final int transactionFees = 1;
    public void pay(int amount){
        System.out.println("Paying with CreditCard: "+"$"+amount);
        System.out.println("Deducting transcation fees of: $"+CreditCardPayment.transactionFees);
    }
}
