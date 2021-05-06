package org.lstec.algorithm.sort;

import java.security.InvalidParameterException;
import java.util.concurrent.ThreadLocalRandom;

public final class QuickSort {
    public static void sort(int[] data) {
        if (data == null) {
            throw new InvalidParameterException("Invalid params");
        }
        sortCore(data, 0, data.length -1);
    }

    private static void sortCore(int[] data, int start, int end) {
        if (start == end) {
            return;
        }

        int index = partition(data, start, end);
        if (index > start) {
            sortCore(data, start, index - 1);
        }
        if (index < end) {
            sortCore(data, index + 1, end);
        }
    }

    private static int partition(int[] data, int start, int end) {
        if (data == null) {
            throw new InvalidParameterException("Invalid params");
        }

        int indexInPartition = ThreadLocalRandom.current().nextInt(start, end + 1);
        swap(data, indexInPartition, end);

        int small = start - 1;
        for (int index = start; index < end; ++index) {
            if (data[index] < data[end]) {
                ++small;
                if (small != index) {
                    swap(data, index, small);
                }
            }
        }
        ++small;
        swap(data, small, end);

        return small;
    }

    private static void swap(int[] data, int p1, int p2) {
        if (data == null) {
            throw new InvalidParameterException("Invalid params");
        }
        int temp = data[p1];
        data[p1] = data[p2];
        data[p2] = temp;
    }
}
