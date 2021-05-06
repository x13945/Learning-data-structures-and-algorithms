package org.lstec.algorithm.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        boolean exist = BinarySearch.findExistIndex(new int[]{0, 2, 3}, 1);
        System.out.println(exist);
    }

    public static boolean findExistIndex(int[] arr, int target) {
        if (arr == null || arr.length == 0 || (arr.length == 1 && arr[0] != target)) {
            return false;
        } else {
            return find(arr, 0, arr.length - 1, target);
        }
    }

    private static boolean find(int[] arr, int start, int end, int target) {
        if (start == end) {
            return arr[start] == target;
        } else {
            if (arr[start] > target || arr[end] < target) {
                return false;
            } else {
                int index = start + (end - start) / 2;
                int v = arr[index];
                if (v > target) {
                    return find(arr, start, index - 1, target);
                } else if (v < target) {
                    return find(arr, index + 1, end, target);
                } else {
                    return true;
                }
            }
        }
    }

}
