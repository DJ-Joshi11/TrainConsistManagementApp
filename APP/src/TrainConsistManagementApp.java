package src.Main;

import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC10TrainConsistManagementApp {

    public static int totalCapacity(List<Bogie> bogies) {
        return bogies.stream().map(b -> b.capacity).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC10 - Total Seating Capacity");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        int total = totalCapacity(bogies);

        System.out.println("Total Seating Capacity:");
        System.out.println(total);
    }
}