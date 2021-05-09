package org.lstec.algorithm.sort

class BubbleSortKt {
    companion object {
        fun sort(arr: IntArray?): IntArray? {
            return if (arr == null || arr.size == 1) {
                arr
            } else {
                for (i in 0 until arr.size - 1) {
                    for (j in 0 until arr.size - 2 - i) {
                        if (arr[j] > arr[j + 1]) {
                            val temp = arr[j + 1]
                            arr[j + 1] = arr[j]
                            arr[j] = temp
                        }
                    }
                }

                arr
            }
        }
    }
}