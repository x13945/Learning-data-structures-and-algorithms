package org.lstec.algorithm.question_7_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
class StackByQueueTest {

    @Test
    void stack() {
        StackByQueue<Integer> stack = new StackByQueue<>();

        stack.push(1);
        assertEquals(1, stack.pop().intValue());
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
    }
}
