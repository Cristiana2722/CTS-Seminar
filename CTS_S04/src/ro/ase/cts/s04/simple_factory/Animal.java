package ro.ase.cts.s04.simple_factory;

interface Animal {
    void sound();
}

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

// Simple Factory
class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        else if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.sound();

        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.sound();

        Animal animal = AnimalFactory.createAnimal("Dog");
        animal.sound();
        animal = AnimalFactory.createAnimal("Cat");
        animal.sound();
    }
}
