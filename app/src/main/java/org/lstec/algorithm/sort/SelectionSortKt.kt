package org.lstec.algorithm.sort

class SelectionSortKt {
    companion object {
        fun sort(arr: IntArray?): IntArray? {
            if (arr == null || arr.size <= 1) {
                return arr
            } else {
                for (i in arr.indices) {
                    var smallestIndex = i;
                    for (j in smallestIndex + 1 until arr.size) {
                        if (arr[j] < arr[smallestIndex]) {
                            smallestIndex = j
                        }
                    }
                    if (smallestIndex != i) {
                        val temp = arr[i]
                        arr[i] = arr[smallestIndex]
                        arr[smallestIndex] = temp
                    }
                }
                return arr
            }
        }
    }
}