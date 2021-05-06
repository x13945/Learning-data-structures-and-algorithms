package org.lstec.algorithm.question_4

import org.junit.Assert.*
import org.junit.Test

class ReplaceBlankKtTest{
    @Test
    fun test() : Unit {
        assertEquals("We%20Are%20Happy", ReplaceBlankKt.replaceSpace("We Are Happy"))
    }
}