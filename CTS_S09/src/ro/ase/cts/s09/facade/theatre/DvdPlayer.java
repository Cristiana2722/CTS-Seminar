package ro.ase.cts.s09.facade.theatre;

public class DvdPlayer {
    public void on() {
        System.out.println("DVDPlayer on");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void stop() {
        System.out.println("Movie stopped");
    }

    public void eject() {
        System.out.println("CD ejected");
    }

    public void off() {
        System.out.println("DVDPlayer off");
    }
}
