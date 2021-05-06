package org.lstec.algorithm.question_4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

class ReplaceBlankTest {

    @Test
    void replace() {
        /* 1.输入的字符串中包含空格  */
        /* 1.1 空格位于字符串的最前面 */
        String input = " We are happy";
        String expected = "%20We%20are%20happy";
        assertArrayEquals(expected.toCharArray(), ReplaceBlank.replace(Arrays.copyOf(input.toCharArray(), expected.length()), input.length()));

        /* 1.2 空格位于字符串的最后面 */
        input = "We are happy ";
        expected = "We%20are%20happy%20";
        assertArrayEquals(expected.toCharArray(), ReplaceBlank.replace(Arrays.copyOf(input.toCharArray(), expected.length()), input.length()));

        /* 1.3 空格位于字符串的中间 */
        input = "We are happy";
        expected = "We%20are%20happy";
        assertArrayEquals(expected.toCharArray(), ReplaceBlank.replace(Arrays.copyOf(input.toCharArray(), expected.length()), input.length()));

        /* 1.4 字符串中有连续空格 */
        input = "We are  happy";
        expected = "We%20are%20%20happy";
        assertArrayEquals(expected.toCharArray(), ReplaceBlank.replace(Arrays.copyOf(input.toCharArray(), expected.length()), input.length()));

        /* 2. 输入的字符串没有空格*/
        input = "We";
        expected = "We";
        assertArrayEquals(expected.toCharArray(), ReplaceBlank.replace(Arrays.copyOf(input.toCharArray(), expected.length()), input.length()));

        /* 2. 输入的字符串为空*/
        assertArrayEquals(null, ReplaceBlank.replace(null, 0));
    }
}
