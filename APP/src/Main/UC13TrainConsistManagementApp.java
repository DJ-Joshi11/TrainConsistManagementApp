package src.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC13TrainConsistManagementApp {

    public static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC13 - Performance Comparison");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();

        System.out.println("Loop Time: " + (endLoop - startLoop));
        System.out.println("Stream Time: " + (endStream - startStream));

        System.out.println("\nFiltered Bogies (Loop):");
        for (Bogie b : loopResult) {
            System.out.println(b.name + " " + b.capacity);
        }

        System.out.println("\nFiltered Bogies (Stream):");
        for (Bogie b : streamResult) {
            System.out.println(b.name + " " + b.capacity);
        }
    }
}