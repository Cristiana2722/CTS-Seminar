package ro.ase.cts.s08.composite;

// Target interface
interface PaymentProcessor {
    void processPayment(double payment);
}

// Adaptee 1
public class PayPal {
    public PayPal() {

    }
    void sendPayment(double payment) {
        System.out.println("Payment sent through PayPal (" + payment + "$).");
    }
}

// Adaptee 2
class Stripe {
    public Stripe() {

    }
    void makePayment(double payment) {
        System.out.println("Payment sent through Stripe (" + payment + "$).");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;
    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double payment) {
        payPal.sendPayment(payment);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;
    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double payment) {
        stripe.makePayment(payment);
    }
}

// Client code
class Main2 {
    public static void main(String[] args) {
        PaymentProcessor payPalAdapter = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
        double payment = 7;
        payPalAdapter.processPayment(payment);
        stripeAdapter.processPayment(payment);
    }
}