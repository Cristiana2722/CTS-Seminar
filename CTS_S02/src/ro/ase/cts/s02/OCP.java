package ro.ase.cts.s02;

//  Open/Closed Principle (OCP)
public class OCP {}

interface Vehicle {
    double calculateValue();
}

class Car implements Vehicle {
    private double value;
    @Override
    public double calculateValue() {
        return value * 0.8;
    }
}

class Bike implements Vehicle {
    private double value;
    @Override
    public double calculateValue() {
        return value * 0.5;
    }
}