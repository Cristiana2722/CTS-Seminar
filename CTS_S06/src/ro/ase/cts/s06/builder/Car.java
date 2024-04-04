package ro.ase.cts.s06.builder;

public interface Car {
    public void setChassis(String chassis);
    public void setWheels(String wheels);
    public void setEngine(String engine);
    public void setInsideDesign(String insideDesign);
    public String showDetails();
}

class RegularCar implements Car {
    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String additives;
    @Override
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public void setInsideDesign(String insideDesign) {
        this.insideDesign = insideDesign;
    }
    public void setAdditives(String additives) {
        this.additives = additives;
    }
    @Override
    public String showDetails() {
        return "MasinaClasica{" +
                "sasiu='" + chassis + '\'' +
                ", roti='" + wheels + '\'' +
                ", motor='" + engine + '\'' +
                ", interior='" + insideDesign + '\'' +
                ", aditivi='" + additives + '\'' + '}';
    }
}

class ElectricCar implements Car {
    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String charger;

    @Override
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public void setInsideDesign(String insideDesign) {
        this.insideDesign = insideDesign;
    }
    public void setCharger(String charger) {
        this.charger = charger;
    }
    @Override
    public String showDetails() {
        return "MasinaElectrica{" +
                "sasiu='" + chassis + '\'' +
                ", roti='" + wheels + '\'' +
                ", motor='" + engine + '\'' +
                ", interior='" + insideDesign + '\'' +
                ", incarcator='" + charger + '\'' +
                '}';
    }
}

interface CarBuilder {
    public void buildChassis();
    public void buildWheels();
    public void buildInteriorDesign();
    public void buildEngine();

    public Car getCar();
}

class RegularCarBuilder implements CarBuilder {
    private Car m;
    RegularCarBuilder()
    {
        this.m = new RegularCar();
    }

    @Override
    public void buildChassis() {
        this.m.setChassis("Sasiu de masina clasica");
    }

    @Override
    public void buildWheels() {
        this.m.setWheels("Roti cu capace de masina clasica");
    }

    @Override
    public void buildInteriorDesign() {
        this.m.setInsideDesign("Interior masina clasica");
    }

    @Override
    public void buildEngine() {
        this.m.setEngine("Motor diesel");
    }

    public void buildAdditives() {
        ((RegularCar)m).setAdditives("AdBlue Diesel");
    }
    @Override
    public Car getCar() {
        return this.m;
    }
}

class ElectricCarBuilder implements CarBuilder {
    private Car car;
    ElectricCarBuilder()
    {
        this.car = new ElectricCar();
    }

    @Override
    public void buildChassis() {
        this.car.setChassis("Sasiu de masina electrica");
    }

    @Override
    public void buildWheels() {
        this.car.setWheels("Roti special proiectate pentru masina electrica");
    }

    @Override
    public void buildInteriorDesign() {
        this.car.setInsideDesign("Interior masina electrica");
    }

    @Override
    public void buildEngine() {
        this.car.setEngine("Motor electric");
    }

    public void buildCharger() {
        ((ElectricCar) car).setCharger("Incarcator rapid");
    }
    @Override
    public Car getCar() {
        return this.car;
    }
}

class CarEngineer {
    private CarBuilder builder;

    CarEngineer(CarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar()
    {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildInteriorDesign();
        builder.buildChassis();
        if(builder instanceof ElectricCarBuilder)
            ((ElectricCarBuilder) builder).buildCharger();
        else
            ((RegularCarBuilder) builder).buildAdditives();
    }

    public Car getCar() {
        return builder.getCar();
    }
}

class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ElectricCarBuilder();
        CarEngineer inginer = new CarEngineer(builder);
        inginer.buildCar();
        Car masina = inginer.getCar();
        System.out.println(masina.showDetails());

        builder = new RegularCarBuilder();
        inginer = new CarEngineer(builder);
        inginer.buildCar();
        masina = inginer.getCar();
        System.out.println(masina.showDetails());
    }
}
