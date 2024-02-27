package ro.ase.cts.s02;

//  Single Responsibility Principle (SRP)
public class SRP {}

public class Vehicle {
    public void printDetails() {}
    public double calculateValue() {}
    public void addVehicleToDB() {}
}

// SRP
class DetailPrinter {
    public void printDetails() {}
}

class Calculator {
    public double calculateValue() {}
}

class AddToDB {
    public void addVehicleToDB() {}
}