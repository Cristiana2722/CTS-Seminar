package ro.ase.cts.s09.decorator;

// Interfata component
interface Subscription {
    String getDescription();
    double getPrice();
}

// Implementare de baza a unui abonament
public class BasicSubscription implements Subscription {
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}

// Decorator abstract
abstract class SubscriptionDecorator implements Subscription {
    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return subscription.getPrice();
    }
}

// Decorator pentru adaugarea de optiune de vizionare offline
class OfflineViewingDecorator extends SubscriptionDecorator {

    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}

// Decorator pentru adaugarea de optiune de vizionare in calitate HD
class HDStreamingDecorator extends SubscriptionDecorator {

    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare in calitate HD";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

// Codul client
class Main2 {
    public static void main(String[] args) {
        // Creaza un abonament de baza
        Subscription subscription = new BasicSubscription();

        // Adauga optiune de vizionare offline
        subscription = new OfflineViewingDecorator(subscription);

        // Adauga optiune de vizionare in calitate HD
        subscription = new HDStreamingDecorator(subscription);

        // Afiseaza descrierea si pretul final al abonamentului
        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());
    }

}