package cts.costan.cristiana.g1103.main;

import cts.costan.cristiana.g1103.builder.*;
import cts.costan.cristiana.g1103.singleton.*;

public class Main {
    public static void main(String[] args) {
        // Builder:
        SystemBuilder builder = new GamingSystemBuilder();
        SystemEngineer engineer = new SystemEngineer(builder);
        engineer.buildSystem();
        IGamingSystem gamingSystem = engineer.getSystem();
        gamingSystem.printConfiguration();

        // Singleton:
        TestingModule testingModule = TestingModule.getInstance();
        System.out.println(testingModule.test());

        ITestingModule t1 = TestingModule.getInstance();
        System.out.println(t1.test());
    }
}
