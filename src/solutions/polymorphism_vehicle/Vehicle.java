package solutions.polymorphism_vehicle;

public class Vehicle {
    protected String licenseNumber;
    protected int year;
    protected double maxSpeed;

    public Vehicle(String licenseNumber, int year, double maxSpeed) {
        this.licenseNumber = licenseNumber;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("Ops.. Need to implement");
    }
}
