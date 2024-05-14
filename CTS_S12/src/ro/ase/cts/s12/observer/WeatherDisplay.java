package ro.ase.cts.s12.observer;

import java.util.ArrayList;
import java.util.List;

// 1. Subject (Observable)
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// 2. Observer
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// 3. Concrete observer
public class WeatherDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("Weather Display: Temperature = " + temperature + "F, Humidity = " +
                humidity + "%, Pressure = " + pressure + "Pa");
    }
}

// 4. Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

// Client Code
class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Simulate weather updates
        weatherStation.setMeasurements(75, 60, 30.4f);
        weatherStation.setMeasurements(80, 65, 29.2f);
    }
}