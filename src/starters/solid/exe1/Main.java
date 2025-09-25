package starters.solid.exe1;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean validate() {
        return this.name != null && !this.name.isEmpty()
                && this.price >= 0 && this.category != null && !this.category.isEmpty();
    }

}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("pro1", 150.34, "Veg");
        System.out.println("Validate " + p1.getName() + ": " + p1.validate());
    }
}
