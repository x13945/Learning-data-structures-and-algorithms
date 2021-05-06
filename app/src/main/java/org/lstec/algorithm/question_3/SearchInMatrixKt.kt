package org.lstec.algorithm.question_3

class SearchInMatrixKt {
    companion object {

        /**
         * 从左上角开始遍历，效率比较低
         */
        fun findByTraverse(matrix: Array<IntArray>, target: Int): Boolean {
            for (row in matrix) {
                for (col in row) {
                    if (col == target) {
                        return true;
                    }
                }
            }
            return false
        }

        /**
         * 从右上角开始遍历，可以快速排除部分元素
         */
        fun findByInverse(matrix: Array<IntArray>, target: Int): Boolean {
            if (matrix.isNotEmpty()) {
                var row = 0;
                var column = matrix[row].size - 1
                if (column >= 0) {
                    while (row >= 0 && column >= 0) {
                        val i = matrix[row][column]
                        when {
                            i == target -> {
                                return true
                            }
                            i > target -> {
                                column--
                            }
                            else -> {
                                row++
                            }
                        }
                    }
                    return false;
                } else {
                    return false
                }
            } else {
                return false
            }
        }
    }
}