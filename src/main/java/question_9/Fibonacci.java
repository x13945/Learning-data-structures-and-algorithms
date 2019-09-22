package question_9;

import java.security.InvalidParameterException;

public class Fibonacci {
    public static int findByRecursive(int n) {
        if (n < 0) {
            throw new InvalidParameterException("Invalid params: n = " + n);
        }
        int result[] = {0, 1};
        if (n < 2) {
            return result[n];
        }

        return findByRecursive(n - 1) + findByRecursive(n - 2);
    }

    public static int findByLoop(int n) {
        if (n < 0) {
            throw new InvalidParameterException("Invalid params: n = " + n);
        }
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }


        int fibBefore = 0;
        int fibAfter = 1;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibBefore + fibAfter;

            fibBefore = fibAfter;
            fibAfter = fibN;
        }

        return fibN;

    }
}
