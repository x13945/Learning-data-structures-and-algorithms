package org.lstec.algorithm.sort

import org.junit.Assert.*
import org.junit.Test

class MergeSortTest {
    @Test
    fun test(): Unit {
        assertArrayEquals(
            null,
            MergeSort.sort(null)
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            MergeSort.sort(listOf(1, 2, 3, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            MergeSort.sort(listOf(5, 4, 3, 2, 1).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            MergeSort.sort(listOf(1, 3, 2, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 3, 4, 4, 5).toIntArray(),
            MergeSort.sort(listOf(1, 4, 3, 4, 5).toIntArray())
        )
    }
}