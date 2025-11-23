package PaymentProcessingSystem;

public class PaymentProcessorSimulator {
    public static void main(String[] args) {
        Checkout checkout = new Checkout() {
        };
        checkout.setPaymentBehavior(new CreditCardPayment());
        checkout.performPayment(2500);

        checkout.setPaymentBehavior(new UPIPayment());
        checkout.performPayment(500);

        checkout.setPaymentBehavior(new CryptoPayment());
        checkout.performPayment(2000);

        checkout.setPaymentBehavior(null);
        checkout.performPayment(100);

    }
}
