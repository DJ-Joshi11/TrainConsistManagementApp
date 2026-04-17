package src;

import org.junit.jupiter.api.Test;
import src.Main.UC16TrainConsistManagementApp;
import static org.junit.jupiter.api.Assertions.*;

public class UC16TrainConsistManagementAppTest {

    @Test
    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        int[] result = UC16TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, result);
    }

    @Test
    void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        int[] result = UC16TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, result);
    }

    @Test
    void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        int[] result = UC16TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, result);
    }

    @Test
    void testSort_SingleElementArray() {
        int[] arr = {50};
        int[] result = UC16TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, result);
    }

    @Test
    void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        int[] result = UC16TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{40, 40, 40}, result);
    }
}