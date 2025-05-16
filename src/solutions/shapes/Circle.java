package solutions.shapes;

public class Circle extends Shape {
    private final int radius;

    public Circle(int frameThickness, COLORS color, int radius) {
        super(frameThickness, color);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle circle){
            return super.equals(obj) && circle.radius == radius;
        }
        return false;
    }
}
