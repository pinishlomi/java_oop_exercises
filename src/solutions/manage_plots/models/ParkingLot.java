package solutions.manage_plots.models;

public abstract class ParkingLot extends Plot {
    private int numberOfSpots;
    private double hourlyRate;

    public ParkingLot(double sizeSqM, int numberOfSpots, double hourlyRate) {
        super(sizeSqM);
        if (numberOfSpots < 0) {
            throw new IllegalArgumentException("Number of spots cannot be negative.");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.numberOfSpots = numberOfSpots;
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateWaterUsage() {
        return 0; // Parking lots typically don't use water for infrastructure provided by municipality.
    }

    @Override
    public String toString() {
        return "ParkingLot [numberOfSpots=" + numberOfSpots + ", hourlyRate=" + hourlyRate + ", " + super.toString() + "]";
    }
}

