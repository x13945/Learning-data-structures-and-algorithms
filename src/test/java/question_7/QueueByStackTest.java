package question_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueByStackTest {

    @Test
    void queue() {
        QueueByStack<Integer> queue = new QueueByStack<>();
        queue.appendTail(1);
        queue.appendTail(2);
        assertEquals(1, queue.deleteHead().intValue());
        queue.appendTail(3);
        assertEquals(2, queue.deleteHead().intValue());
        assertEquals(3, queue.deleteHead().intValue());
    }

}
