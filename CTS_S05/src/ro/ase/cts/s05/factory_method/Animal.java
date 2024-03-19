package ro.ase.cts.s05.factory_method;

// Product interface
public interface Animal {
    void sound();
}

// Concrete products
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Creator interface (Factory Method)
interface AnimalFactory {
    Animal createAnimal();
}

// Concrete creators
class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Client code
class MainEx1 {
    public static void main(String[] args) {
        // Using factory Method to create instances
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.sound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.sound();
    }
}