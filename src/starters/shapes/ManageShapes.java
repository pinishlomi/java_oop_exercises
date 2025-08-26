package starters.shapes;

import java.util.Arrays;
import java.util.Random;

public class ManageShapes {
    private final String name;
    private Shape[] shapes;
    private int numOfShapes;

    public ManageShapes(String name) {
        this.name = name;
        shapes = new Shape[2];
    }

    public String init(int amount){
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        COLORS color;
        int size, colorsLen = COLORS.values().length;
        SHAPES_STATUS res;
        Shape shape;
        int i = 0;
        // TODO Implement your code here
        return sb.toString();
    }

    private SHAPES_STATUS add(Shape shape) {
        // TODO Implement your code here
        return null;
    }

    private boolean isExist(Shape shape) {
        // TODO Implement your code here
        return false;
    }

    public String getAllPerimeters() {
        // TODO Implement your code here
        return null;
    }

    public String getAllAreas() {
        // TODO Implement your code here
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("All shapes in ").append(name).append(" Shapes System");
        // TODO Implement your code here
        return sb.toString();
    }
}
