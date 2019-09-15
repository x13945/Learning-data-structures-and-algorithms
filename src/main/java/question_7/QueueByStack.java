package question_7;

import java.util.Stack;

public class QueueByStack <T>{
    private Stack stackToAdd = new Stack<T>();
    private Stack stackToDel = new Stack<T>();

    public void appendTail(T t) {
        stackToAdd.push(t);
    }

    public T deleteHead() {
        if (stackToDel.size() == 0) {
            if (stackToAdd.size() == 0) {
                return null;
            } else {
                transferStack();
                return (T) stackToDel.pop();
            }
        } else {
            return (T) stackToDel.pop();
        }
    }

    private void transferStack() {
        while (stackToAdd.size() > 0) {
            T t = (T) stackToAdd.pop();
            stackToDel.push(t);

        }
    }
}
