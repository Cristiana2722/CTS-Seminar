package cts.costan.cristiana.g1103.builder;

public class GamingSystemBuilder implements SystemBuilder {
    private GamingSystem gamingSystem;

    public GamingSystemBuilder()
    {
        this.gamingSystem = new GamingSystem();
    }

    @Override
    public void buildMotherboard() {
        this.gamingSystem.setMotherboard("GIGABYTE");
    }

    @Override
    public void buildRAM() {
        this.gamingSystem.setRAM("16GB");
    }

    @Override
    public void buildStorage() {
        this.gamingSystem.setStorage("1TB");
    }

    @Override
    public void buildGraphicsCard() {
        this.gamingSystem.setGraphicsCard("NVIDIA");
    }

    @Override
    public GamingSystem getSystem() {
        return this.gamingSystem;
    }

    public void buildMouse() {
        ((GamingSystem)gamingSystem).setMouse("GENESIS");
    }
    public void buildKeyboard() {
        ((GamingSystem)gamingSystem).setKeyboard("LOGITECH");
    }
    public void buildHeadphones() {
        ((GamingSystem)gamingSystem).setHeadphones("RAZER");
    }
}
