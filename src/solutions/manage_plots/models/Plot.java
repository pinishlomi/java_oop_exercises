package solutions.manage_plots.models;

import java.util.UUID;

public abstract class Plot {
    private String serialNumber;
    protected double sizeSqM; // Size in square meters

    public Plot(double sizeSqM) {
        this.serialNumber = UUID.randomUUID().toString(); // Generate a unique ID
        this.sizeSqM = sizeSqM;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getSizeSqM() {
        return sizeSqM;
    }

    public abstract double calculateMunicipalTax();
    public abstract double calculateWaterUsage();

    @Override
    public String toString() {
        return "Plot [serialNumber=" + serialNumber + ", sizeSqM=" + sizeSqM + "]";
    }
}
//abstract class Residence extends Plot {
//    private int numberOfResidents;
//    private static final double MUNICIPAL_TAX_RATE_PER_SQM = 80.0; // NIS per sq.m for residences
//    private static final double WATER_USAGE_PER_SQM = 0.5; // cu.m per sq.m for residences
//
//    public Residence(double sizeSqM, int numberOfResidents) {
//        super(sizeSqM);
//        if (numberOfResidents < 0) {
//            throw new IllegalArgumentException("Number of residents cannot be negative.");
//        }
//        this.numberOfResidents = numberOfResidents;
//    }
//
//    public int getNumberOfResidents() {
//        return numberOfResidents;
//    }
//
//    @Override
//    public double calculateMunicipalTax() {
//        return getSizeSqM() * MUNICIPAL_TAX_RATE_PER_SQM;
//    }
//
//    @Override
//    public double calculateWaterUsage() {
//        return getSizeSqM() * WATER_USAGE_PER_SQM;
//    }
//
//    @Override
//    public String toString() {
//        return "Residence [numberOfResidents=" + numberOfResidents + ", " + super.toString() + "]";
//    }
//}

