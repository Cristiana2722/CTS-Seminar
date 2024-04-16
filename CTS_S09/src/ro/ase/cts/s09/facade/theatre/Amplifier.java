package ro.ase.cts.s09.facade.theatre;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Set DVD");
    }

    public void setSurroundSound() {
        System.out.println("Surround sound on");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
