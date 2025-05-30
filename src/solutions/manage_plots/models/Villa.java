package solutions.manage_plots.models;

public class Villa extends Residence {
    private boolean hasRoof; // Assuming "גג" implies a specific feature, perhaps for solar panels etc.
    private boolean hasPrivateParking;

    public Villa(double sizeSqM, int numberOfResidents, boolean hasRoof, boolean hasPrivateParking) {
        super(sizeSqM, numberOfResidents);
        this.hasRoof = hasRoof;
        this.hasPrivateParking = hasPrivateParking;
    }

    public boolean hasRoof() {
        return hasRoof;
    }

    public boolean hasPrivateParking() {
        return hasPrivateParking;
    }

    @Override
    public double calculateMunicipalTax() {
        return 0;
    }

    @Override
    public double calculateWaterUsage() {
        return 0;
    }

    @Override
    public String toString() {
        return "Villa [hasRoof=" + hasRoof + ", hasPrivateParking=" + hasPrivateParking + ", " + super.toString() + "]";
    }
}
