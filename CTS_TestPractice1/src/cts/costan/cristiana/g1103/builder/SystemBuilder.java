package cts.costan.cristiana.g1103.builder;

public interface SystemBuilder {
    public void buildMotherboard();
    public void buildRAM();
    public void buildStorage();
    public void buildGraphicsCard();
    public IGamingSystem getSystem();
}
