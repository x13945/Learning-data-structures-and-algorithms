package org.lstec.algorithm.question_4;

public class ReplaceBlank {
    public static char[] replace(char[] string, int originalLength) {
        if (string == null) {
            return null;
        }

        int blankNumber = 0;
        for (int i = 0; i < originalLength; i++) {
            if (string[i] == ' '){
                ++blankNumber;
            }
        }

        if (blankNumber == 0) {
            return string;
        }

        int newLength = originalLength + blankNumber * 2;
        int indexOfOriginal = originalLength -1;
        int indexOfNew = newLength -1;
        while (indexOfNew >= 0 && indexOfOriginal >= 0) {
            if (string[indexOfOriginal] == ' ') {
                string[indexOfNew--] = '0';
                string[indexOfNew--] = '2';
                string[indexOfNew--] = '%';
            } else {
                string[indexOfNew--] = string[indexOfOriginal];
            }
            --indexOfOriginal;
        }
        return string;
    }
}
