package org.lstec.algorithm.question_9_1;

import java.security.InvalidParameterException;

public class FrogJump {
    public static int jump(int n) {
        if (n < 0) {
            throw new InvalidParameterException("Invalid params: n = " + n);
        }

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int jumpN1 = 1;
            int jumpN2 = 2;

            int jumpN = 1;

            for (int i = 3; i <= n; i++) {
                jumpN = jumpN1 + jumpN2;

                jumpN1 = jumpN2;
                jumpN2 = jumpN;
            }
            return jumpN;
        }
    }
}
