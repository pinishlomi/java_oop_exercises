package solutions.generic.warehouse_exe.products;

public abstract class Product {
    private final String name;

    protected Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
