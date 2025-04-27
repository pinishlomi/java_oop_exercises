package solutions.gas_station;

public class VehicleDetails {
    private final String manufacturer;
    private final String model;
    private final int year;

    public VehicleDetails(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " (" + year + ")";
    }
}
