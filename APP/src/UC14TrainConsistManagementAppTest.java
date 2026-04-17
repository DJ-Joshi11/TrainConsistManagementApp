package src;

import org.junit.jupiter.api.Test;
import src.Main.UC14TrainConsistManagementApp;
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

public class UC14TrainConsistManagementAppTest {

    @Test
    void testException_ValidCapacityCreation() throws Exception {
        src.Main.Bogie b = new src.Main.Bogie("Sleeper", 72);
        assertNotNull(b);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> {
            new src.Main.Bogie("Sleeper", -10);
        });

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> {
            new src.Main.Bogie("Sleeper", 0);
        });

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(Exception.class, () -> {
            new src.Main.Bogie("Sleeper", 0);
        });

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        src.Main.Bogie b = new src.Main.Bogie("Sleeper", 72);
        assertEquals("Sleeper", b.name);
        assertEquals(72, b.capacity);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {
        List<src.Main.Bogie> bogies = new ArrayList<>();

        bogies.add(new src.Main.Bogie("Sleeper", 72));
        bogies.add(new src.Main.Bogie("AC Chair", 60));

        assertEquals(2, bogies.size());
    }
}