public class DIP {
}

// Dependency Inversion Principle (DIP)

interface Engine {
    public void start();
}

class Car {
    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}

class PetrolEngine implements Engine {
    @Override
    public void start() {}
}

class DieselEngine implements Engine {
    @Override
    public void start() {}
}

// Engine e = new PetrolEngine()
// I obj = new C1()
