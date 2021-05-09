package org.lstec.algorithm.sort

import org.junit.Assert.*
import org.junit.Test

class BubbleSortKtTest {
    @Test
    fun test(): Unit {
        assertArrayEquals(
            null,
            BubbleSortKt.sort(null)
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            BubbleSortKt.sort(listOf(1, 2, 3, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 2, 3, 4, 5).toIntArray(),
            BubbleSortKt.sort(listOf(1, 3, 2, 4, 5).toIntArray())
        )
        assertArrayEquals(
            listOf(1, 3, 4, 4, 5).toIntArray(),
            BubbleSortKt.sort(listOf(1, 4, 3, 4, 5).toIntArray())
        )
    }
}