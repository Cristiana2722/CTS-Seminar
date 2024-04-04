package cts.costan.cristiana.g1103.singleton;

public class TestingModule implements ITestingModule {
    private static TestingModule instance;
    private TestingModule() { }
    public static TestingModule getInstance() {
        if (instance == null) {
            instance = new TestingModule();
        }
        return instance;
    }

    @Override
    public String test() {
        return "Positive results: no issues found.";
    }
}
