package org.lstec.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
class QuickSortTest {

    @Test
    void sort() {
        int[] data = {3, 2, 4, 1, 7, 9, 10};
        QuickSort.sort(data);

        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 9, 10}, data);
    }
}
