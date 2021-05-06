package org.lstec.algorithm.question_10;

public class FindOneInBinary {
    public static int findByShift(int number) {
        int count = 0;
        int flag = 1;

        while (flag > 0) {
            if ((number & flag) > 0) {
                count++;
            }

            flag = flag << 1;
        }

        return count;
    }

    public static int findBySubtraction(int number) {
        int count = 0;
        while (number != 0) {
            ++count;
            number = (number -1) * number;
        }
        return count;
    }
}
