package org.lstec.algorithm.sort

class BubbleSortKt {
    companion object {
        fun sort(arr: IntArray?): IntArray? {
            return if (arr == null || arr.size == 1) {
                arr
            } else {
                for (i in arr.indices) {
                    // 如果有元素在冒泡的过程中，没有数据交换，说明该数组已经排好顺序
                    // 最好的时间复杂度就是这个时候：O(n)
                    var swap = false
                    for (j in 0 until arr.size - 1 - i) {
                        if (arr[j] > arr[j + 1]) {
                            val temp = arr[j + 1]
                            arr[j + 1] = arr[j]
                            arr[j] = temp
                            swap = true
                        }
                    }
                    if (!swap) {
                        return arr
                    }
                }

                arr
            }
        }
    }
}