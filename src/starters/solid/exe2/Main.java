package starters.solid.exe2;

import java.util.ArrayList;

abstract class Shape{
    private final String type;
    protected double measurement;

    public Shape(String type, double measurement) {
        this.type = type;
        this.measurement = measurement;
    }

    public double calculateArea() {
        return switch (type) {
            case "circle" -> Math.PI * measurement * measurement;
            case "square" -> measurement * measurement;
            case "triangle" -> 0.5 * measurement * measurement;
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}

class Circle extends Shape {

    public Circle(double measurement) {
        super("circle", measurement);
    }

    @Override
    public double calculateArea() {
        return Math.PI * measurement * measurement;
    }

}

class Triangle extends Shape {

    public Triangle(double measurement) {
        super("triangle", measurement);
    }

    @Override
    public double calculateArea() {
        return 0.5 * measurement * measurement;
    }

}

class Square extends Shape {

    public Square(double measurement) {
        super("square", measurement);
    }

    @Override
    public double calculateArea() {
        return measurement * measurement;
    }

}

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.2));
        shapes.add(new Square(5.9));
        shapes.add(new Triangle(1.7));
        shapes.forEach(shape ->
                System.out.println(
                        shape.getClass().getSimpleName() + ": " + shape.calculateArea()));
    }
}
