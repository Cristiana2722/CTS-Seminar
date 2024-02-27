package ro.ase.cts.s02;

// Liskov Substitution Principle (LSP)
public class LSP {}

interface Height {
    void setHeight();
}

interface Width {
    void setWidth();
}

class Rectangle implements Height, Width {
    private double height;
    private double width;
    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }
}

class Square implements Height {
    private double height;
    public void setHeight(double h) {
        height = h;
    }
}