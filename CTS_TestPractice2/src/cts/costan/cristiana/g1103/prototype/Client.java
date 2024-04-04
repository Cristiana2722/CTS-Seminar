package cts.costan.cristiana.g1103.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Map<String, IPoster> posters = new HashMap<>();

    public Client() {
    }

    public IPoster create(String type) throws InterruptedException {
        IPoster posterToReturn = posters.get(type);
        if(posterToReturn == null)
        {
            System.out.println("Object needs to be created.");
            if(type=="concert")
                posterToReturn = new ConcertPoster();
            else if (type=="theatre")
                posterToReturn = new TheatrePoster();
            else
                posterToReturn = new StandUpComedyPoster();

            this.posters.put(type, posterToReturn);
        }
        return posterToReturn.clone();
    }
}
