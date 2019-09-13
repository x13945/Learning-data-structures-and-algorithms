package question_5;

import java.util.Iterator;
import java.util.Stack;

public class PrintLinkedList {
    public static void printReverseRecursively(XLinkedList<Integer> list) {
        if (list != null) {
            printNodeRecursively(list.first);
        }
    }

    private static void printNodeRecursively(ListNode<Integer> node) {
        if (node != null) {
            if (node.next != null) {
                printNodeRecursively(node.next);
            }
            System.out.println(node.value);
        }
    }
    public static void printReverseByStack(XLinkedList<Integer> list) {
        if (list == null) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode<Integer> l = list.first;
        while (l != null) {
            stack.push(l.value);
            l = l.next;
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}

class XLinkedList<T> {
    ListNode<T> first;
    private ListNode<T> last;

    void add(T value) {
        ListNode<T> node = new ListNode<T>();
        node.value = value;
        add(node);
    }

    void add(ListNode<T> element) {
        final ListNode l = last;

        last = element;
        if (l == null) {
            first = element;
        } else {
            l.next = element;
        }
    }

    void print() {
        ListNode l = first;
        while (l != null) {
            System.out.println(l.value);
            l = l.next;
        }
    }
}

class ListNode<T> {
    T value;
    ListNode next;
}
