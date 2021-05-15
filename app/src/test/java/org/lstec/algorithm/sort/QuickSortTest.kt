package org.lstec.algorithm.sort

import org.junit.Assert
import org.junit.Test

internal class QuickSortTest {
    @Test
    fun sort() {
        val data = intArrayOf(3, 2, 4, 1, 7, 9, 10)
        QuickSort.sort(data)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4, 7, 9, 10), data)
    }
}