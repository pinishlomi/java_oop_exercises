package solutions.polymorphism_vehicle;

import java.util.Arrays;

public class Garage {
    private Vehicle[] vehicles;
    private int numOfVehicles;

    public Garage() {
        vehicles = new Vehicle[2];
        numOfVehicles = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (numOfVehicles == vehicles.length) {
            vehicles = Arrays.copyOf(vehicles, numOfVehicles * 2);
        }
        vehicles[numOfVehicles++] = vehicle;
    }

    public void driveAll() {
        for (int i = 0; i < numOfVehicles; i++) {
            vehicles[i].drive();
        }
    }
}
