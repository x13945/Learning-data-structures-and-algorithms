package org.lstec.algorithm.sort

class InsertionSortKt {
    companion object {
        fun sort(arr: IntArray?): IntArray? {
            return if (arr == null || arr.size <= 1) {
                arr;
            } else {
                for (i in 1 until arr.size) {
                    val value = arr[i]
                    var j = i - 1;

                    while (j >= 0) {
                        if (arr[j] > value) {
                            arr[j + 1] = arr[j]
                            --j
                        } else {
                            break;
                        }
                    }
                    arr[j + 1] = value
                }
                arr
            }
        }
    }
}