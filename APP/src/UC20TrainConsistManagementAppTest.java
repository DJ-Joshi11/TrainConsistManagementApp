package src;

import org.junit.jupiter.api.Test;
import src.Main.UC20TrainConsistManagementApp;

import static org.junit.jupiter.api.Assertions.*;

public class UC20TrainConsistManagementAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};

        Exception e = assertThrows(IllegalStateException.class, () -> {
            UC20TrainConsistManagementApp.searchBogie(arr, "BG101");
        });

        assertEquals("No bogies available for search", e.getMessage());
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101","BG205"};

        assertDoesNotThrow(() -> {
            UC20TrainConsistManagementApp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(UC20TrainConsistManagementApp.searchBogie(arr, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};

        assertFalse(UC20TrainConsistManagementApp.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};

        assertTrue(UC20TrainConsistManagementApp.searchBogie(arr, "BG101"));
    }
}