package org.lstec.algorithm.sort

import org.junit.Assert
import org.junit.Test

internal class InsertionSortTest {
    @Test
    fun sort() {
        val data = intArrayOf(3, 5, 4, 1, 2, 6)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6), InsertionSort.sort(data))
        val data1 = intArrayOf(3, 5, 4, 4, 1, 2, 6)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4, 4, 5, 6), InsertionSort.sort(data1))
    }
}