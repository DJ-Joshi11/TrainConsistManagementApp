package src.Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11TrainConsistManagementApp {

    public static boolean validateTrainID(String trainID) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainID);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("========================================\n");

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + validateTrainID(trainID));
        System.out.println("Cargo Code Valid: " + validateCargoCode(cargoCode));
    }
}