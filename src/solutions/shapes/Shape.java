package solutions.shapes;

public abstract class Shape {
    protected int frameThickness;
    protected COLORS color;

    public Shape(int frameThickness, COLORS color2) {
        this.frameThickness = frameThickness;
        this.color = color2;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", frameThickness: " + frameThickness + ", color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Shape shape){
            return frameThickness == shape.frameThickness && color == shape.color;
        }
        return false;
    }
}
