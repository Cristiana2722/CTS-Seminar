package cts.costan.cristiana.g1103.builder;

public class GamingSystem implements IGamingSystem {
    private String motherboard;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String mouse;
    private String keyboard;
    private String headphones;

    @Override
    public void printConfiguration() {
        System.out.println( "GamingSystem{" +
                "motherboard='" + motherboard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", headphones='" + headphones + '\'' +
                '}');
    }

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setHeadphones(String headphones) {
        this.headphones = headphones;
    }
}
