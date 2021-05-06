package org.lstec.algorithm.question_3

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SearchInMatrixKtTest{
    fun findByTraverse() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 8, 9),
            intArrayOf(2, 4, 9, 12),
            intArrayOf(4, 7, 10, 13),
            intArrayOf(6, 8, 11, 15)
        )

        /* 1. 数组中包含查找的数字 */
        /* 1.1 查找的数字是数组中的最大值 */assertTrue(SearchInMatrixKt.findByTraverse(matrix, 15))
        /* 1.2 查找的数字是数组中的最小值 */assertTrue(SearchInMatrixKt.findByTraverse(matrix, 1))
        /* 1.3 查找的数字是数组中的最小值 */assertTrue(SearchInMatrixKt.findByTraverse(matrix, 9))


        /* 2 查找的数字不在数组中 */assertFalse(SearchInMatrixKt.findByTraverse(matrix, -1))

//        /* 3 输入特殊值 */assertFalse(SearchInMatrixKt.findByTraverse(null, -1))
    }
    @Test
    fun findByInverse() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 8, 9),
            intArrayOf(2, 4, 9, 12),
            intArrayOf(4, 7, 10, 13),
            intArrayOf(6, 8, 11, 15)
        )

        /* 1. 数组中包含查找的数字 */
        /* 1.1 查找的数字是数组中的最大值 */assertTrue(SearchInMatrixKt.findByInverse(matrix, 15))
        /* 1.2 查找的数字是数组中的最小值 */assertTrue(SearchInMatrixKt.findByInverse(matrix, 1))
        /* 1.3 查找的数字是数组中的中间值 */assertTrue(SearchInMatrixKt.findByInverse(matrix, 10))


        /* 2 查找的数字不在数组中 */assertFalse(SearchInMatrixKt.findByTraverse(matrix, -1))
        /* 2 查找的数字不在数组中 */assertFalse(SearchInMatrixKt.findByTraverse(matrix, 14))

//        /* 3 输入特殊值 */assertFalse(SearchInMatrixKt.findByTraverse(null, -1))
    }
}