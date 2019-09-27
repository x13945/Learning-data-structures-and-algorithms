package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        int[] data = {3, 5, 4, 1, 2, 6};

        assertArrayEquals(new int[]{1,2,3,4,5,6}, BubbleSort.sort(data));
    }
}
