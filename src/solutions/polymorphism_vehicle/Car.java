package solutions.polymorphism_vehicle;

public class Car extends Vehicle {

    public Car(String licenseNumber, int year, double maxSpeed) {
        super(licenseNumber, year, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Car driving smoothly on the road.");
    }
}
