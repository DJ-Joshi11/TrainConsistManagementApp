package src;

import org.junit.jupiter.api.Test;
import src.Main.UC13TrainConsistManagementApp;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestBogie {
    String name;
    int capacity;

    TestBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC13TrainConsistManagementAppTest {

    @Test
    void testLoopFilteringLogic() {
        List<TestBogie> bogies = new ArrayList<>();
        bogies.add(new TestBogie("Sleeper", 72));
        bogies.add(new TestBogie("AC Chair", 60));

        List result = UC13TrainConsistManagementApp.filterWithLoop((List) bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<TestBogie> bogies = new ArrayList<>();
        bogies.add(new TestBogie("Sleeper", 72));
        bogies.add(new TestBogie("AC Chair", 60));

        List result = UC13TrainConsistManagementApp.filterWithStream((List) bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<TestBogie> bogies = new ArrayList<>();
        bogies.add(new TestBogie("Sleeper", 72));
        bogies.add(new TestBogie("Sleeper", 80));
        bogies.add(new TestBogie("AC Chair", 60));

        List loopResult = UC13TrainConsistManagementApp.filterWithLoop((List) bogies);
        List streamResult = UC13TrainConsistManagementApp.filterWithStream((List) bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<TestBogie> bogies = new ArrayList<>();
        bogies.add(new TestBogie("Sleeper", 72));

        long start = System.nanoTime();
        UC13TrainConsistManagementApp.filterWithLoop((List) bogies);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<TestBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new TestBogie("Sleeper", i));
        }

        List result = UC13TrainConsistManagementApp.filterWithLoop((List) bogies);

        assertTrue(result.size() > 0);
    }
}