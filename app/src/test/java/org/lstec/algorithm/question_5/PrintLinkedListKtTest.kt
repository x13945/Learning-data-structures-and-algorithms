package org.lstec.algorithm.question_5

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class PrintLinkedListKtTest {

    @Test
    fun printReverse() {
        val head = ListNode(1)
        val first = ListNode(3)
        val second = ListNode(4)
        val third = ListNode(2)
        val tail = ListNode(1)

        head.next = first
        first.next = second
        second.next = third
        third.next = tail

        assertArrayEquals(
            intArrayOf(1, 2, 4, 3, 1),
            PrintLinkedListKt.printReverseRecursively(head)
        )
        assertArrayEquals(
            intArrayOf(1, 2, 4, 3, 1),
            PrintLinkedListKt.printReverseByStack(head)
        )
    }
}