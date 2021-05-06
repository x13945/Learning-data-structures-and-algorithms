package org.lstec.algorithm.sort;

public class SelectionSort {
    public static int[] sort(int[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Invalid args");
        }

        if (data.length <= 1) {
            return data;
        }

        for (int i = 0; i < data.length - 2; i++) {

            int minIndex = i + 1;
            for (int j = i + 1; j < data.length - 1; j++) {
                if (data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i + 1) {
                int temp = data[minIndex];
                data[minIndex] = data[i + 1];
                data[i +1] = temp;
            }
        }

        return data;
    }
}
