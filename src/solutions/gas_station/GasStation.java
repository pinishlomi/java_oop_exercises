package solutions.gas_station;

public class GasStation {
    private static int totalVehiclesRefueled;
    private final FuelPump[] pumps;
    private int numOfPumps;

    public GasStation(int maxPumps) {
        pumps = new FuelPump[maxPumps];
    }

    public void addPump(FuelPump pump) {
        if (numOfPumps < pumps.length) {
            pumps[numOfPumps++] = pump;
        } else {
            System.out.println("No space for more pumps.");
        }
    }

    public FuelPump[] getPumps() {
        return pumps;
    }

    public static int getTotalVehiclesRefueled() {
        return totalVehiclesRefueled;
    }

    public static void increaseVehicleCount() {
        totalVehiclesRefueled++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Gas Station Details:\n");
        for (int i = 0; i < numOfPumps; i++) {
            sb.append(pumps[i]).append("\n");
        }
        return sb.toString();
    }
}
