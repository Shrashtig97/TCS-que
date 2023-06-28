import java.util.HashMap;
import java.util.Map;

public class CityBus {
    private static final int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

    public static int getFare(String source, String destination) {
        Map<String, Integer> stopIndices = new HashMap<>();
        stopIndices.put("TH", 0);
        stopIndices.put("GA", 1);
        stopIndices.put("IC", 2);
        stopIndices.put("HA", 3);
        stopIndices.put("TE", 4);
        stopIndices.put("LU", 5);
        stopIndices.put("NI", 6);
        stopIndices.put("CA", 7);

        int sourceIndex = stopIndices.get(source);
        int destinationIndex = stopIndices.get(destination);

        int totalDistance;
        if (destinationIndex >= sourceIndex) {
            totalDistance = calculateDistance(sourceIndex, destinationIndex);
        } else {
            totalDistance = calculateDistance(sourceIndex, path.length - 1)
                    + calculateDistance(0, destinationIndex);
        }

        int farePerDistance = 5;
        int fare = farePerDistance * (totalDistance / 1000);
        if (totalDistance % 1000 != 0) {
            fare += farePerDistance;
        }

        return fare;
    }

    private static int calculateDistance(int startIndex, int endIndex) {
        int distance = 0;
        for (int i = startIndex; i < endIndex; i++) {
            distance += path[i];
        }
        return distance;
    }

    public static void main(String[] args) {
        String source = "NI";
        String destination = "HA";
        int fare = getFare(source, destination);
        System.out.println("Travel Fare: " + fare + " INR");
    }
}
