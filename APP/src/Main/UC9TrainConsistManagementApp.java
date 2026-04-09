package src.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC9TrainConsistManagementApp {

    public static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream().collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));

        Map<String, List<Bogie>> grouped = groupBogies(bogies);

        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " :");
            for (Bogie b : entry.getValue()) {
                System.out.println(b.capacity);
            }
        }
    }
}