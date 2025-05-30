package solutions.manage_plots.models;

public class Building extends Residence {
    private int numberOfFloors;
    private int numberOfApartments;

    public Building(double sizeSqM, int numberOfResidents, int numberOfFloors, int numberOfApartments) {
        super(sizeSqM, numberOfResidents);
        if (numberOfFloors < 1) {
            throw new IllegalArgumentException("Number of floors must be at least 1.");
        }
        if (numberOfApartments < 1) {
            throw new IllegalArgumentException("Number of apartments must be at least 1.");
        }
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
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
        return "Building [numberOfFloors=" + numberOfFloors + ", numberOfApartments=" + numberOfApartments + ", " + super.toString() + "]";
    }
}
