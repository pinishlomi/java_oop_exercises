package starters.solid.exe4;

interface ShapeAble {
    void draw();
    void resize();
    void rotate();
}

abstract class Shape implements ShapeAble{

}
class Circle extends Shape {
    @Override
    public void draw() {
        // code to draw circle
    }

    @Override
    public void resize() {
        // code to resize circle
    }

    @Override
    public void rotate() {
        // code to rotate circle
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        // code to draw rectangle
    }

    @Override
    public void resize() {
        // code to resize rectangle
    }

    @Override
    public void rotate() {
        // code to rotate rectangle
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        c1.resize();
        c1.rotate();
        Rectangle r1 = new Rectangle();
        r1.draw();
        r1.resize();
        r1.rotate();
    }
}

