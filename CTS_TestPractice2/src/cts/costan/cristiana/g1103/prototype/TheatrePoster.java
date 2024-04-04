package cts.costan.cristiana.g1103.prototype;

public class TheatrePoster implements IPoster {
    private String logo;

    public TheatrePoster() throws InterruptedException {
        System.out.println("Logo generation started ...");
        Thread.sleep(2000);
        System.out.println("Logo generation finished.");
        this.logo = "THEATRE SHOW";
    }

    public TheatrePoster(String logo) {
        this.logo = logo;
    }

    @Override
    public void print() {
        System.out.println("Logo: " + logo);
    }

    @Override
    public IPoster clone() {
        TheatrePoster copy = null;
        try {
            copy = new TheatrePoster();
            copy.logo = this.logo;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
