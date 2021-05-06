package org.lstec.algorithm.question_7_1;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class StackByQueue<T> {
    private Queue queue1 = new ArrayBlockingQueue<T>(1 << 4);
    private Queue queue2 = new ArrayBlockingQueue<T>(1 << 4);

    public void push(T t) {
        if (queue1.size() == 0 && queue2.size() == 0) {
            queue1.add(t);
        } else {
            Queue<T> q = findNotEmptyQueue();
            q.add(t);
        }
    }

    private Queue<T> findEmptyQueue() {
        return queue1.size() == 0 ? queue1 : queue2;
    }
    private Queue<T> findNotEmptyQueue() {
        return queue1.size() == 0 ? queue2 : queue1;
    }

    public T pop() {
        if (queue1.size() == 0 && queue2.size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty!");
        } else {
            Queue<T> q = findNotEmptyQueue();
            if (q.size() == 1) {
                return q.poll();
            } else {
                Queue<T> emptyQueue = findEmptyQueue();
                while (q.size() > 1) {
                    T t = q.poll();
                    emptyQueue.add(t);
                }
                return q.poll();
            }
        }
    }
}
