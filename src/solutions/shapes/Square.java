package solutions.shapes;

public class Square extends Shape {
    private final int size;

    public Square(int frameThickness, COLORS color, int size) {
        super(frameThickness, color);
        this.size = size;
    }

    @Override
    public double getPerimeter() {
        return size * 4;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    public String draw() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(("*  ").repeat(size)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() + ", size: " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Square square){
            return super.equals(obj) && square.size == size;
        }
        return false;
    }

}
