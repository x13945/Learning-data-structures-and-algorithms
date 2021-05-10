package org.lstec.algorithm.sort

import org.junit.Assert.*
import org.junit.Test

class InsertionSortKtTest {
    @Test
    fun test(): Unit {
        assertArrayEquals(
            null,
            InsertionSortKt.sort(null)
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            InsertionSortKt.sort(listOf(1, 2, 3, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            InsertionSortKt.sort(listOf(5, 4, 3, 2, 1).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            InsertionSortKt.sort(listOf(1, 3, 2, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 3, 4, 4, 5).toIntArray(),
            InsertionSortKt.sort(listOf(1, 4, 3, 4, 5).toIntArray())
        )
    }
}