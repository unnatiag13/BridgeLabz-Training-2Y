public interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunded amount: " + amount);
    }
}

class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Stripe");
    }
}

class TestPayment {
    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeProcessor();
        stripe.processPayment(500);
        stripe.refund(100); 
    }
}
