package src.Main;

import java.util.Arrays;

public class UC17TrainConsistManagementApp {

    public static String[] sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
        return bogieNames;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC17 - Arrays.sort()");
        System.out.println("========================================\n");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        String[] sorted = sortBogieNames(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(sorted));
    }
}