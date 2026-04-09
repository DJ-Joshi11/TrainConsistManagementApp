package src;

import org.junit.jupiter.api.Test;
import src.Main.UC9TrainConsistManagementApp;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC9TrainConsistManagementAppTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(132, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(156, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("First Class", 24));

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(24, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));

        int total = UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(144, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        int size = bogies.size();

        UC9TrainConsistManagementApp.totalCapacity((List) bogies);

        assertEquals(size, bogies.size());
    }
}