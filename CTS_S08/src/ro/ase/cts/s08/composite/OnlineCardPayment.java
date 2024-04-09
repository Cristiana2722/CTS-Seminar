package ro.ase.cts.s08.composite;

// Target interface
interface PaymentProcessorS {
    void processPayment(double payment);
}

// Adaptee 1
public class OnlineCardPayment {
    public OnlineCardPayment() {

    }
    void pay(double payment) {
        System.out.println("Payment made with Online Card (" + payment + "$).");
    }
}

// Adaptee 2
class BitcoinPayment {
    public BitcoinPayment() {

    }
    void pay(double payment) {
        System.out.println("Payment made with Bitcoin (" + payment + "$).");
    }
}

// Adapter for PayPal
class OnlinePaymentAdapter implements PaymentProcessorS {
    private OnlineCardPayment onlineCardPayment;
    public OnlinePaymentAdapter(OnlineCardPayment onlineCardPayment) {
        this.onlineCardPayment = onlineCardPayment;
    }

    @Override
    public void processPayment(double payment) {
        onlineCardPayment.pay(payment);
    }
}

// Adapter for Stripe
class BitcoinPaymentAdapter implements PaymentProcessorS {
    private BitcoinPayment bitcoinPayment;
    public BitcoinPaymentAdapter(BitcoinPayment bitcoinPayment) {
        this.bitcoinPayment = bitcoinPayment;
    }

    @Override
    public void processPayment(double payment) {
        bitcoinPayment.pay(payment);
    }
}

// Client code
class Main3 {
    public static void main(String[] args) {
        PaymentProcessorS onlineCardAdapter = new OnlinePaymentAdapter(new OnlineCardPayment());
        PaymentProcessorS bitcoinAdapter = new BitcoinPaymentAdapter(new BitcoinPayment());
        double payment = 7;
        onlineCardAdapter.processPayment(payment);
        bitcoinAdapter.processPayment(payment);
    }
}