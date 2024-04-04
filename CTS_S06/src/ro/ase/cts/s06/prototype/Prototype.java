package ro.ase.cts.s06.prototype;

import java.util.HashMap;
import java.util.Map;

public interface Prototype {
    Prototype clone();
}

class ConcretePrototypeA implements Prototype {
    String generationTimeConsumingData;
    public ConcretePrototypeA() throws InterruptedException {
        System.out.println("A:  Data generation started ...");
        Thread.sleep(10000);
        System.out.println("A:  Data generation finished.");
        this.generationTimeConsumingData = "GENERATED DATA";
    }
    public ConcretePrototypeA(String generationTimeConsumingData)
    {
        // !!!! deep copy
        this.generationTimeConsumingData = generationTimeConsumingData;
    }

    public Prototype clone() {
        ConcretePrototypeA copy = null;
        try {
            copy = new ConcretePrototypeA();
            copy.generationTimeConsumingData = this.generationTimeConsumingData;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ConcretePrototypeB implements Prototype {
    String generationTimeConsumingData;
    public ConcretePrototypeB() throws InterruptedException {
        System.out.println("B:  Data generation started ...");
        Thread.sleep(10000);
        System.out.println("B:  Data generation finished.");
        this.generationTimeConsumingData = "GENERATED DATA";
    }
    public ConcretePrototypeB(String generationTimeConsumingData)
    {
        // !!!! deep copy
        this.generationTimeConsumingData = generationTimeConsumingData;
    }

    public Prototype clone() {
        ConcretePrototypeB copy = null;
        try {
            copy = new ConcretePrototypeB();
            copy.generationTimeConsumingData = this.generationTimeConsumingData;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Client {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public Client() {
//        prototypes.put("A", new ConcretePrototypeA());
//        prototypes.put("B", new ConcretePrototypeB());
    }

    public Prototype create(String type) throws InterruptedException {
        Prototype prototypeToReturn = prototypes.get(type);
        if(prototypeToReturn == null)
        {
            System.out.println("Object needs to be created.");
            if(type=="A")
                prototypeToReturn = new ConcretePrototypeA();
            else
                prototypeToReturn = new ConcretePrototypeB();

            this.prototypes.put(type, prototypeToReturn);
        }

        return prototypeToReturn.clone();
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        prototypeA = client.create("A");
        prototypeB = client.create("B");
    }
}
