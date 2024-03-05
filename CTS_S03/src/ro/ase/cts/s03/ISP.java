package ro.ase.cts.s03;

public class ISP {
}

// Interface Segregation Principle (ISP)

interface VehicleWithDoors {
    void drive();
    public void stop();
    public void refuel();
    public void openDoors();
}

interface VehicleWithoutDoors {
    void drive();
    public void stop();
    public void refuel();
}

class Bike implements VehicleWithoutDoors {
    @Override
    public void drive() {

    }
    @Override
    public void stop() {
    }
    @Override
    public void refuel() {

    }
}

class Car implements VehicleWithDoors {

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void openDoors() {

    }
}