package question_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInMatrixTest {

    @Test
    void find() {
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        /* 1. 数组中包含查找的数字 */
        /* 1.1 查找的数字是数组中的最大值 */
        Assertions.assertTrue(SearchInMatrix.find(matrix, 15));
        /* 1.2 查找的数字是数组中的最小值 */
        Assertions.assertTrue(SearchInMatrix.find(matrix, 1));
        /* 1.3 查找的数字是数组中的最小值 */
        Assertions.assertTrue(SearchInMatrix.find(matrix, 9));


        /* 2 查找的数字不在数组中 */
        Assertions.assertFalse(SearchInMatrix.find(matrix, -1));

        /* 3 输入特殊值 */
        Assertions.assertFalse(SearchInMatrix.find(null, -1));
    }
}
