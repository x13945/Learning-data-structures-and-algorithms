package org.lstec.algorithm.question_10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class FindOneInBinaryTest {

    @Test
    void findByShift() {
        assertEquals(3, FindOneInBinary.findByShift(0b111));
        assertEquals(1, FindOneInBinary.findByShift(0x40000000));
    }

    @Test
    void findBySubtraction() {
        assertEquals(3, FindOneInBinary.findByShift(0b111));
        assertEquals(1, FindOneInBinary.findByShift(0x40000000));
    }
}
