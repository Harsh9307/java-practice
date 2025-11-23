package PaymentProcessingSystem;

public class UPIPayment implements PaymentBehavior {
    public static final int transactionFees = 0;
    public void pay(int amount){
        System.out.println("Paying with UPI: "+"$"+amount);        
    }
}
