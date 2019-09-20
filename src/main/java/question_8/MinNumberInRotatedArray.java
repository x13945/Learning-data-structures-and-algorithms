package question_8;

import java.security.InvalidParameterException;

public class MinNumberInRotatedArray {
    public static int find(int[] numbers) {
        if (numbers == null) {
            throw new InvalidParameterException("Invalid params");
        }

        int head = 0;
        int tail = numbers.length -1;
        int midIndex = head;
        while (numbers[head] >= numbers[tail]) {
            if (tail - head == 1) {
                midIndex = tail;
                break;
            }

            midIndex = (head + tail) / 2;

            if (numbers[head] == numbers[tail] && numbers[head] == numbers[midIndex]) {
                return minInOrder(numbers);
            }

            if (numbers[midIndex] >= numbers[head]) {
                head = midIndex;
            } else if (numbers[midIndex] <= numbers[tail]) {
                tail = midIndex;
            }
        }

        return numbers[midIndex];
    }

    static int minInOrder(int numbers[]) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }

        return result;
    }
}
