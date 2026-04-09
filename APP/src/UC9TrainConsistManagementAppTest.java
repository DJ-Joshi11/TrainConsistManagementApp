package src;

import org.junit.jupiter.api.Test;
import src.Main.UC9TrainConsistManagementApp;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12TrainConsistManagementAppTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));

        boolean result = UC9TrainConsistManagementApp.isSafe((List) bogies);

        assertTrue(result);
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        boolean result = UC9TrainConsistManagementApp.isSafe((List) bogies);

        assertFalse(result);
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean result = UC9TrainConsistManagementApp.isSafe((List) bogies);

        assertTrue(result);
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        boolean result = UC9TrainConsistManagementApp.isSafe((List) bogies);

        assertFalse(result);
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<GoodsBogie> bogies = new ArrayList<>();

        boolean result = UC9TrainConsistManagementApp.isSafe((List) bogies);

        assertTrue(result);
    }
}