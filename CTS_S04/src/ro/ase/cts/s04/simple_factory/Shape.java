package ro.ase.cts.s04.simple_factory;

interface Shape {
    void draw();
}

class Square implements Shape {
    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("This is a square.");
    }
}

class Circle implements Shape {

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("This is a circle.");
    }
}

// Simple Factory
class ShapeFactory {
    public static Shape createShape(String type) {
        if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        }
        else if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Shape square = ShapeFactory.createShape("Square");
        square.draw();

        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();

        Shape shape = ShapeFactory.createShape("Square");
        shape.draw();
        shape = ShapeFactory.createShape("Circle");
        shape.draw();
    }
}
