package solutions.manage_plots.models;

public class Garden extends Plot {
    private static final double WATER_USAGE_PER_SQM = 1.2; // cu.m per sq.m for gardens (higher than residences)

    public Garden(double sizeSqM) {
        super(sizeSqM);
    }

    @Override
    public double calculateMunicipalTax() {
        return 0; // Gardens typically don't generate municipal tax revenue directly from the garden itself.
    }

    @Override
    public double calculateWaterUsage() {
        return getSizeSqM() * WATER_USAGE_PER_SQM;
    }

    @Override
    public String toString() {
        return "Garden [" + super.toString() + "]";
    }
}

