package cts.costan.cristiana.g1103.prototype;

public class StandUpComedyPoster implements IPoster {
    private String logo;

    public StandUpComedyPoster() throws InterruptedException {
        System.out.println("Logo generation started ...");
        Thread.sleep(2000);
        System.out.println("Logo generation finished.");
        this.logo = "STAND-UP COMEDY SHOW";
    }

    public StandUpComedyPoster(String logo) {
        this.logo = logo;
    }

    @Override
    public void print() {
        System.out.println("Logo for standup: " + logo);
    }

    @Override
    public IPoster clone() {
        StandUpComedyPoster copy = null;
        try {
            copy = new StandUpComedyPoster();
            copy.logo = this.logo;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
