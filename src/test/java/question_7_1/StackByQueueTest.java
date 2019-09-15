package question_7_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
