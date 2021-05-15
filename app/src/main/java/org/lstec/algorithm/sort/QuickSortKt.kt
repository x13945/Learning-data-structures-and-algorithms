package org.lstec.algorithm.sort

class QuickSortKt {
    companion object {
        fun sort(array: IntArray): IntArray {
            sortImpl(array, 0, array.size - 1)
            return array
        }

        private fun sortImpl(array: IntArray, start: Int, end: Int): Unit {
            if (start >= end) {
                return
            } else {
                val p = partition(array, start, end)
                sortImpl(array, start, p - 1)
                sortImpl(array, p + 1, end)
            }
        }

        private fun partition(array: IntArray, start: Int, end: Int): Int {
            val pivot = array[end]
            var i = start
            var j = start

            while (j <= end) {
                if (array[j] < pivot) {
                    swap(array, i, j)
                    i++
                }
                j++
            }
            swap(array, i, end)

            return i
        }

        private fun swap(array: IntArray, i: Int, j: Int) {
            var temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
}