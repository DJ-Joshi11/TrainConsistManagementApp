package src;

import org.junit.jupiter.api.Test;
import src.Main.UC9TrainConsistManagementApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("AC Chair", 60));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        Map<String, List<Bogie>> result = UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertEquals(2, result.get("Sleeper").size());
        assertEquals(1, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        int originalSize = bogies.size();

        UC9TrainConsistManagementApp.groupBogies((List) bogies);

        assertEquals(originalSize, bogies.size());
    }
}