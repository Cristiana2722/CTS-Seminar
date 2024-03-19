package ro.ase.cts.s05.abstract_factory;

// Abstract Product A
public interface Chair {
    String sitOn();
}

// Concrete Product A1
class ModernChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a modern chair.";
    }
}

// Concrete Product A2
class VictorianChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a victorian chair.";
    }
}

// Abstract Product B
interface Sofa {
    String lieOn();
}

// Concrete Product A1
class ModernSofa implements Sofa {
    @Override
    public String lieOn() {
        return "Lying on a modern sofa.";
    }
}

// Concrete Product A2
class VictorianSofa implements Sofa {
    @Override
    public String lieOn() {
        return "Lying on a victorian sofa.";
    }
}


// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factory 1
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Concrete Factory 2
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Client
class Client {
    private final FurnitureFactory furnitureFactory;

    Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void useFurniture() {
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());
    }
}

class MainEx3 {
    public static void main(String[] args) {
//        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
//        Chair modernChair = modernFurnitureFactory.createChair();
//        System.out.println(modernChair.sitOn());

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        System.out.println("Client uses modern furniture:");
        Client client1 = new Client(modernFactory);
        client1.useFurniture();

        System.out.println("\nClient uses victorian furniture:");
        Client client2 = new Client(victorianFactory);
        client2.useFurniture();
    }
}