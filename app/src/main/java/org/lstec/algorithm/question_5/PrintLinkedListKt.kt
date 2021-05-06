package org.lstec.algorithm.question_5

import java.util.*
import kotlin.collections.ArrayList


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class PrintLinkedListKt {
    companion object {
        fun printReverseRecursively(head: ListNode): IntArray {
            val result = mutableListOf<Int>()
            printReverseRecursively(head, result)

            return result.toIntArray()
        }

        private fun printReverseRecursively(head: ListNode, result: MutableList<Int>): Unit {
            if (head.next != null) {
                printReverseRecursively(head.next!!, result)
            }
            result.add(head.`val`)
        }


        fun printReverseByStack(head: ListNode): IntArray {
            val stack = Stack<Int>()
            var p: ListNode? = head
            do {
                if (p != null) {
                    stack.push(p.`val`)
                    p = p.next;
                }
            } while (p != null)

            val result = ArrayList<Int>(stack.size)
            while (!stack.empty()) {
                result.add(stack.pop())
            }

            return result.toIntArray()
        }
    }
}