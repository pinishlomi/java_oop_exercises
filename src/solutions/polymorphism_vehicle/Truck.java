package solutions.polymorphism_vehicle;

public class Truck extends Vehicle {

    public Truck(String licenseNumber, int year, double maxSpeed) {
        super(licenseNumber, year, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Truck hauling heavy cargo.");
    }
}
