package starters.manage_plots.models;

import static starters.manage_plots.Utils.isExist;
import static starters.manage_plots.Utils.resizeArr;

public class Street {
    private final String name;
    private final String city;
    private Plot[] plots;
    private int numOfPlots;

    public Street(String name, String city, int initialNumberOfPlots) {
        this.name = name;
        this.city = city;
        this.plots = new Plot[initialNumberOfPlots]; // Initialize with capacity
    }

    public String getName() {
        return name;
    }


    public int getNumOfPlots() {
        return numOfPlots;
    }

    public void addPlot(Plot plot) {
        if (plot == null) {
            throw new IllegalArgumentException("Cannot add a null plot.");
        }
        if (isExist(plots, numOfPlots, plot)){
            throw new RuntimeException("Plot already exist.");
        }
        if (plots.length == numOfPlots){
            plots = (Plot[]) resizeArr(plots);
        }
        this.plots[numOfPlots++] = plot;
    }

    public double getMunicipalTaxRevenue() {
        return 0;
    }

    public double getWaterUsageCuM() {
        return 0;
    }

    @Override
    public String toString() {
        return "Street [name=" + name + ", city=" + city + ", number of plots=" + numOfPlots + "]";
    }

    public String showPlots() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOfPlots; i++) {
            sb.append(plots[i]).append("\n");
        }
        return sb.toString();
    }
}
