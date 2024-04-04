package cts.costan.cristiana.g1103.builder;

public class SystemEngineer {
    private SystemBuilder builder;

    public SystemEngineer(SystemBuilder builder) {
        this.builder = builder;
    }

    public void buildSystem()
    {
        builder.buildMotherboard();
        builder.buildGraphicsCard();
        builder.buildRAM();
        builder.buildStorage();
        if(builder instanceof GamingSystemBuilder) {
            ((GamingSystemBuilder) builder).buildKeyboard();
            ((GamingSystemBuilder) builder).buildMouse();
            ((GamingSystemBuilder) builder).buildHeadphones();
        }
    }

    public IGamingSystem getSystem() {
        return builder.getSystem();
    }
}
