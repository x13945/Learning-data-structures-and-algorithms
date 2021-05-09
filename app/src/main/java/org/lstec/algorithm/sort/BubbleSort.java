package org.lstec.algorithm.sort;

public class BubbleSort {
    public static int[] sort(int[] data) {
        if (data == null || data.length == 1) {
            return data;
        }

        for (int i = 0; i < data.length; i++) {
            boolean swap = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                return data;
            }
        }
        return data;
    }
}
