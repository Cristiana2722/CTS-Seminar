package cts.costan.cristiana.g1103.factory_method;

import java.util.ArrayList;
import java.util.List;

public class StandUpComedy implements IShow {
    private String name;
    private String location;
    private String dateTime;
    private boolean licentiousLanguage;
    private List<String> comedianList;

    @Override
    public void printDetails() {
        System.out.println("This is a stand-up comedy show.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getDateTime() {
        return dateTime;
    }
}

class Comedian {
    public String stageName;
}