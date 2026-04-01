
import java.util.HashSet;
public class TrainConsistManagementApp{
    public static void main(String[] args){
        System.out.println("=== Train Consist Management App ===");
        HashSet<String> bogieIds=new HashSet<>();
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101");
        bogieIds.add("B102");
        System.out.println("Unique bogie IDs: "+bogieIds);
    }
}