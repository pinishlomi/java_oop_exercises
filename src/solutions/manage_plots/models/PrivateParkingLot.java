package solutions.manage_plots.models;

public class PrivateParkingLot extends ParkingLot {
    private static final double MUNICIPAL_TAX_RATE_PER_SQM = 150.0; // NIS per sq.m for private parking lots

    public PrivateParkingLot(double sizeSqM, int numberOfSpots, double hourlyRate) {
        super(sizeSqM, numberOfSpots, hourlyRate);
    }

    @Override
    public double calculateMunicipalTax() {
        return getSizeSqM() * MUNICIPAL_TAX_RATE_PER_SQM;
    }

    @Override
    public String toString() {
        return "PrivateParkingLot [" + super.toString() + "]";
    }
}
