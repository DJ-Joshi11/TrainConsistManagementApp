package src.Main;

import java.util.Arrays;

public class UC19TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String key) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC19 - Binary Search");
        System.out.println("========================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        boolean found = binarySearch(bogieIds, "BG309");

        System.out.println("Search Result: " + found);
    }
}