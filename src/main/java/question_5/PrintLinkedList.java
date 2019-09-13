package question_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class PrintLinkedList {
    public static void printReverseRecursively(LinkedList list) {
        if (list != null) {
            printNode(list, 0);
        }
    }

    private static void printNode(LinkedList list, int index){
        if (index < list.size()) {
            printNode(list, index + 1);
            System.out.println(list.get(index));
        }
    }

    public static void printReverseByStack(LinkedList<Integer> list) {
        if (list == null) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for (Integer integer : list) {
            stack.push(integer);
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
