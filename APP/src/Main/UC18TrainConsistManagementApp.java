package src.Main;

public class UC18TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC18 - Linear Search");
        System.out.println("========================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}