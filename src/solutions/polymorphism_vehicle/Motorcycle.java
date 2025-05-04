package solutions.polymorphism_vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licenseNumber, int year, double maxSpeed) {
        super(licenseNumber, year, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle speeding between cars!");
    }
}
