package src.Main;

import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12TrainConsistManagementApp {

    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("========================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean result = isSafe(bogies);

        System.out.println("Train Safety Compliance:");
        System.out.println(result);
    }
}