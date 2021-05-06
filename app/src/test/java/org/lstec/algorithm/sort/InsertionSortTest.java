package org.lstec.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
class InsertionSortTest {

    @Test
    void sort() {
        int[] data = {3, 5, 4, 1, 2, 6};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, BubbleSort.sort(data));

        int[] data1 = {3, 5, 4, 4, 1, 2, 6};

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5, 6}, BubbleSort.sort(data1));
    }
}
