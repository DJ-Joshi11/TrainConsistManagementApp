package src.Main;

public class UC20TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("========================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309"};

        try {
            boolean result = searchBogie(bogieIds, "BG205");
            System.out.println("Search Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}