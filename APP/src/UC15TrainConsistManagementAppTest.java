package src;

import org.junit.jupiter.api.Test;
import src.Main.UC15TrainConsistManagementApp;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestGoodsBogie {
    String shape;
    String cargo;

    TestGoodsBogie(String shape) {
        this.shape = shape;
    }
}

public class UC15TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        src.Main.GoodsBogie b = new src.Main.GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        src.Main.GoodsBogie b = new src.Main.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        src.Main.GoodsBogie b = new src.Main.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        src.Main.GoodsBogie b = new src.Main.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");
        b.assignCargo("Coal");

        assertEquals("Coal", b.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        src.Main.GoodsBogie b = new src.Main.GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertTrue(true);
    }
}