package cts.costan.cristiana.g1103.main;

import cts.costan.cristiana.g1103.factory_method.*;
import cts.costan.cristiana.g1103.prototype.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Factory method:
        ShowFactory concertFactory = new ConcertFactory();
        IShow concert = concertFactory.createShow();
        concert.printDetails();

        ShowFactory theatreFactory = new TheatreFactory();
        IShow theatre = theatreFactory.createShow();
        theatre.printDetails();

        ShowFactory standupFactory = new StandUpComedyFactory();
        IShow standup = standupFactory.createShow();
        standup.printDetails();

        // Prototype:
        IPoster concertPoster = new ConcertPoster();
        IPoster c1 = concertPoster.clone();
        concertPoster.print();
        c1.print();

        Client client = new Client();
        IPoster poster1 = client.create("concert");
        IPoster poster2 = client.create("theatre");

        poster1 = client.create("concert");
        poster2 = client.create("theatre");
    }
}
