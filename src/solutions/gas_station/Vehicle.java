package solutions.gas_station;

public class Vehicle {
    private final String licenseNumber;
    private final double tankCapacity;
    private final FuelType fuelType;
    private final VehicleDetails details;

    public Vehicle(String licenseNumber, double tankCapacity, FuelType fuelType, VehicleDetails details) {
        this.licenseNumber = licenseNumber;
        this.tankCapacity = tankCapacity;
        this.fuelType = fuelType;
        this.details = details;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle " + licenseNumber + ": tankCapacity=" +
                tankCapacity + ", fuelType:" + fuelType
                + "\nMore Details:" + details;
    }

}