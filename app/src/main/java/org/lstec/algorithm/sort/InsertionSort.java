package org.lstec.algorithm.sort;

public class InsertionSort {
    public static int[] sort(int[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Invalid args");
        }

        if (data.length <= 1) {
            return data;
        }

        for (int i = 1; i < data.length - 1; i++) {
            int value = data[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (data[j] > value) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = value;
        }

        return data;
    }
}
