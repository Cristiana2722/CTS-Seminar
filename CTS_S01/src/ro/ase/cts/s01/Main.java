package ro.ase.cts.s01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        double result = calculator.calculateX5PlusY7();
        System.out.println("Result: " + result);

    }
}