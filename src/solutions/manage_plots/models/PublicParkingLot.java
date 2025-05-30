package solutions.manage_plots.models;

public class PublicParkingLot extends ParkingLot {
    private double residentDiscountPercentage; // e.g., 0.1 for 10% discount

    public PublicParkingLot(double sizeSqM, int numberOfSpots, double hourlyRate, double residentDiscountPercentage) {
        super(sizeSqM, numberOfSpots, hourlyRate);
        if (residentDiscountPercentage < 0 || residentDiscountPercentage > 1) {
            throw new IllegalArgumentException("Resident discount percentage must be between 0 and 1.");
        }
        this.residentDiscountPercentage = residentDiscountPercentage;
    }

    public double getResidentDiscountPercentage() {
        return residentDiscountPercentage;
    }

    @Override
    public double calculateMunicipalTax() {
        // Public parking lots usually don't pay municipal tax in the same way private ones do.
        // If they did, the calculation would be more complex, likely involving their revenue.
        // For simplicity, assuming 0 tax revenue for municipality from *public* parking lots based on typical models.
        // The problem statement only mentions "חניונים פרטיים" for tax.
        return 0;
    }

    @Override
    public String toString() {
        return "PublicParkingLot [residentDiscountPercentage=" + (residentDiscountPercentage * 100) + "%, " + super.toString() + "]";
    }
}
