
import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==========================================\n");

        // Create a LinkedList to maintain ordered bogies
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        // Index 2 means 3rd position
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first bogie
        if (!trainConsist.isEmpty()) {
            String removedFirst = ((LinkedList<String>) trainConsist).removeFirst();
            System.out.println("\nRemoved first bogie: " + removedFirst);
        }

        // Remove last bogie
        if (!trainConsist.isEmpty()) {
            String removedLast = ((LinkedList<String>) trainConsist).removeLast();
            System.out.println("Removed last bogie: " + removedLast);
        }

        // Display final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}