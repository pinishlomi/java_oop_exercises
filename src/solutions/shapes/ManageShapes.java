package solutions.shapes;

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
        while (i < amount) {
            color = COLORS.values()[r.nextInt(colorsLen)];
            size = r.nextInt(5);
            if (size > 2) {
                shape = new Square(1, color, size);
            }else {
                shape = new Circle(1, color, size);
            }
            res = add(shape);
            if (res != SHAPES_STATUS.SUCCESS){
                sb.append("Failed to add shape ").append(shape).append(", Error: ").append(res).append("\n");
            } else {
                i++;
            }

        }
        return sb.toString();
    }

    private SHAPES_STATUS add(Shape shape) {
        if (isExist(shape)){
            return SHAPES_STATUS.SHAPE_EXIST;
        }
        if (numOfShapes == shapes.length){
            shapes = Arrays.copyOf(shapes, numOfShapes * 2);
        }
        shapes[numOfShapes++] = shape;
        return SHAPES_STATUS.SUCCESS;
    }

    private boolean isExist(Shape shape) {
        for (int i = 0; i < numOfShapes; i++) {
            if (shapes[i].equals(shape)){
                return true;
            }
        }
        return false;
    }

    public String getAllPerimeters() {
        StringBuilder sb = new StringBuilder();
        sb.append("All shapes Perimeters\n");
        for (int i = 0; i < numOfShapes; i++) {
            sb.append(shapes[i].getClass().getSimpleName()).append(": ")
                    .append(shapes[i].getPerimeter()).append("\n");
        }
        return sb.toString();
    }

    public String getAllAreas() {
        StringBuilder sb = new StringBuilder();
        sb.append("All shapes Areas\n");
        for (int i = 0; i < numOfShapes; i++) {
            sb.append(shapes[i].getClass().getSimpleName()).append(": ")
                    .append(shapes[i].getArea()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("All shapes in ").append(name).append(" Shapes System");
        for (int i = 0; i < numOfShapes; i++) {
            sb.append(shapes[i]).append("\n");
            if (shapes[i] instanceof Square square) {
                sb.append(square.draw()).append("\n");
            }
        }
        return sb.toString();
    }
}
