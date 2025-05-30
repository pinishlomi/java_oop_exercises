package solutions.manage_plots;

import solutions.manage_plots.models.*;

public class ManagePlots {
    private Street street;
    public void init(){
        // Create a street
        street = new Street("Ben Yehuda", "Tel Aviv", 5);

        // Add various plots to the street
        Plot building1 = new Building(250.0, 50, 8, 20); // 250 sqm, 50 residents, 8 floors, 20 apartments
        street.addPlot(building1);

        Plot villa1 = new Villa(180.0, 4, true, true); // 180 sqm, 4 residents, has roof, has private parking
        street.addPlot(villa1);

        Plot garden1 = new Garden(100.0); // 100 sqm garden
        street.addPlot(garden1);

        Plot privateParking1 = new PrivateParkingLot(300.0, 50, 15.0); // 300 sqm, 50 spots, 15 NIS/hour
        street.addPlot(privateParking1);

        Plot publicParking1 = new PublicParkingLot(400.0, 80, 10.0, 0.2); // 400 sqm, 80 spots, 10 NIS/hour, 20% discount
        street.addPlot(publicParking1);

        Plot villa2 = new Villa(220.0, 6, false, true);
        street.addPlot(villa2);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(street);

        sb.append("\n--- Street Information ---");
        sb.append(street);
        sb.append("Total Plots on ").append(street.getName()).append(": ").append(street.getNumOfPlots());

        sb.append("\n--- Financials & Resources ---");
        double municipalTax = street.getMunicipalTaxRevenue();
        System.out.printf("Total Municipal Tax Revenue for %s: %.2f NIS%n", street.getName(), municipalTax);

        double waterUsage = street.getWaterUsageCuM();
        System.out.printf("Total Water Usage for %s: %.2f cu.m%n", street.getName(), waterUsage);

        sb.append("\n--- Individual Plot Details (Example) ---\n");
        sb.append(street.showPlots());
        return sb.toString();
    }
}
