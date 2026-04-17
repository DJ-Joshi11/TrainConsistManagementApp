package src.Main;

import java.util.ArrayList;
import java.util.List;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC14TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC14 - Custom Exception Handling");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 24));

            for (Bogie b : bogies) {
                System.out.println(b.name + " " + b.capacity);
            }

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}