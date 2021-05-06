package org.lstec.algorithm.question_9_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
class FrogJumpTest {

    @Test
    void jump() {
        assertEquals(1, FrogJump.jump(1));
        assertEquals(2, FrogJump.jump(2));
        assertEquals(3, FrogJump.jump(3));
    }
}
