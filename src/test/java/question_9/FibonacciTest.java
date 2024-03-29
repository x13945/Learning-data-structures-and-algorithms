package question_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void find() {
        assertEquals(0, Fibonacci.findByRecursive(0));
        assertEquals(3, Fibonacci.findByRecursive(4));
        assertEquals(102334155, Fibonacci.findByRecursive(40));

        assertEquals(0, Fibonacci.findByLoop(0));
        assertEquals(3, Fibonacci.findByLoop(4));
        assertEquals(102334155, Fibonacci.findByLoop(40));
    }
}
