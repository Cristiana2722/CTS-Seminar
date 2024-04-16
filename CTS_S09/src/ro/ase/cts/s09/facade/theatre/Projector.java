package ro.ase.cts.s09.facade.theatre;

public class Projector {
    public void on() {
        System.out.println("Projector on");
    }

    public void setInput(DvdPlayer dvd) {
        System.out.println("Input set");
    }

    public void wideScreenMode() {
        System.out.println("Wide screen on");
    }

    public void off() {
        System.out.println("Projector off");
    }
}
