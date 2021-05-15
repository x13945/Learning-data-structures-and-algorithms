package org.lstec.algorithm.sort

import org.junit.Assert
import org.junit.Test

internal class QuickSortKtTest {
    @Test
    fun sort() {
        val data = intArrayOf(3, 2, 4, 1, 7, 9, 10)
        QuickSortKt.sort(data)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4, 7, 9, 10), data)
    }
}