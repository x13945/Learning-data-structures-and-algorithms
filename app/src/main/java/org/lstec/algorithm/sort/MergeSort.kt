package org.lstec.algorithm.sort

class MergeSort {
    companion object {
        fun sort(array: IntArray?): IntArray? {
            return if (array == null) {
                null
            } else {
                sortImpl(array)
            }
        }

        private fun sortImpl(array: IntArray): IntArray {
            return if (array.size <= 1) {
                array
            } else {
                val middle = array.size / 2

                val leftArr = sortImpl(array.copyOfRange(0, middle))
                val rightArr = sortImpl(
                    array.copyOfRange(middle, array.size)
                )

                mergeArray(leftArr, rightArr)
            }
        }

        private fun mergeArray(
            array1: IntArray,
            array2: IntArray,
        ): IntArray {
            val result = IntArray(array1.size + array2.size)
            var i = 0
            var j = 0
            var index = 0

            while (i < array1.size && j < array2.size) {
                if (array1[i] < array2[j]) {
                    result[index] = array1[i++]
                } else {
                    result[index] = array2[j++]
                }
                index++
            }


            var lastIndex: Int;
            val lastArr: IntArray
            if (i < array1.size) {
                lastIndex = i
                lastArr = array1
            } else {
                lastIndex = j
                lastArr = array2
            }

            while (lastIndex < lastArr.size) {
                result[index++] = lastArr[lastIndex++]
            }

            return result
        }
    }
}