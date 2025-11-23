package PaymentProcessingSystem;

public abstract class Checkout {
    private PaymentBehavior paymentBehavior;

    public void performPayment(int amount) {
        if (paymentBehavior == null) {
            System.out.println("Payment Method not selected");
            return;
        }
        if (amount <= 0) {
            System.out.println("Amount can not be negative or zero!!");
            return;
        }
        paymentBehavior.pay(amount);

    }

    public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
        this.paymentBehavior = paymentBehavior;
    }

    public PaymentBehavior getPaymentBehavior() {
        return this.paymentBehavior;
    }
}
