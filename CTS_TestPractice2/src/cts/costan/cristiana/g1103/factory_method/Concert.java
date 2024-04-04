package cts.costan.cristiana.g1103.factory_method;

import java.util.List;
import java.util.ArrayList;

public class Concert implements IShow {
    private String name;
    private String location;
    private String dateTime;
    private String type;
    private List<String> artistList;

    @Override
    public void printDetails() {
        System.out.println("This is a concert.");
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