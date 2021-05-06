package org.lstec.algorithm.question_3;

public class SearchInMatrix {
    public static boolean find(int[][] matrix, int number) {
        boolean found = false;
        int rows = 0, columns = 0;
        if (matrix != null && (rows = matrix.length) > 0 && (columns = matrix[0].length) > 0) {
            int row = 0;
            int column = columns - 1;

            while (row < rows && column >= 0) {
                int item = matrix[row][column];
                if (item > number) {
                    --column;
                } else if (item == number) {
                    found = true;
                    break;
                } else {
                    ++row;
                }
            }
        }

        return found;
    }
}
