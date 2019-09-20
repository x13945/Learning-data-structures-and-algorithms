package question_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinNumberInRotatedArrayTest {

    @Test
    void find() {
        /* 1. 功能测试*/
        /* 1.1 升序数组的旋转*/
        assertEquals(0, MinNumberInRotatedArray.find(new int[]{3, 5, 6, 0, 1}));
        /* 1.2 有重复数字的升序数组的旋转*/
        assertEquals(0, MinNumberInRotatedArray.find(new int[]{3, 5, 5, 6, 0, 1}));
        assertEquals(0, MinNumberInRotatedArray.find(new int[]{3, 5, 6, 0, 1, 1}));
        assertEquals(0, MinNumberInRotatedArray.find(new int[]{3, 5, 5, 6, 0, 1, 1}));

        /* 2. 边界测试*/
        assertEquals(1, MinNumberInRotatedArray.find(new int[]{1, 2, 3, 5, 8}));
        assertEquals(1, MinNumberInRotatedArray.find(new int[]{1}));

        /* 3. 特殊测试*/

        MinNumberInRotatedArray.find(null);
    }
}
