package solutions.gas_station;

public class FuelPump {
    private final int id;
    private final FuelType fuelType;
    private double availableLiters;

    public FuelPump(int id, FuelType fuelType, double availableLiters) {
        this.id = id;
        this.fuelType = fuelType;
        this.availableLiters = availableLiters;
    }

    public double refuel(Vehicle vehicle) {
        if (vehicle.getFuelType() != this.fuelType) {
            System.out.println("Fuel type mismatch. Cannot refuel vehicle " + vehicle.getLicenseNumber());
            return 0;
        }

        double amountToRefuel = vehicle.getTankCapacity();
        double amountRefueled = Math.min(amountToRefuel, availableLiters);
        availableLiters -= amountRefueled;
        GasStation.increaseVehicleCount();
        System.out.println("Refueled vehicle " + vehicle.getLicenseNumber() + " with " + amountRefueled + " liters.");
        return amountRefueled;
    }

    @Override
    public String toString() {
        return "Pump " + id + ": FuelType=" + fuelType + ", Available=" + availableLiters + "L";
    }
}
