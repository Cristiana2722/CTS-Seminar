package ro.ase.cts.s08.adapter;

import java.util.ArrayList;
import java.util.List;

interface GUIComponent {
    void draw();
}
public class Button implements GUIComponent {
    private String name;
    public Button(String name) {
        this.name = name;
    }
    @Override
    public void draw() {
        System.out.println("Name: " + name);
    }
}

class Panel implements GUIComponent {
    private List<GUIComponent> items = new ArrayList<>();
    private String name;
    public Panel(String name) {
        this.name = name;
    }
    @Override
    public void draw() {
        System.out.println("Panel: " + name);
        for (GUIComponent item : items) {
            item.draw();
        }
    }
    public void addItem(GUIComponent item) {
        items.add(item);
    }
}

class Main2 {
    public static void main(String[] args) {
        // Creating buttons
        Button button1 = new Button("New");
        Button button2 = new Button("Delete");
        Button button3 = new Button("Save");

        // Creating the main panel
        Panel mainPanel = new Panel("MainPanel");

        // Adding buttons to the main panel
        mainPanel.addItem(button1);
        mainPanel.addItem(button2);

        // Creating a secondary panel
        Panel secondaryPanel = new Panel("SecondaryPanel");

        // Adding files to the secondary panel
        secondaryPanel.addItem(button3);

        // Adding the secondary panel to the main panel
        mainPanel.addItem(secondaryPanel);

        // Printing the contents of the main panel
        mainPanel.draw();
    }
}
