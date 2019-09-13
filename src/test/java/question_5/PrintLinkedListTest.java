package question_5;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class PrintLinkedListTest {

    @Test
    void printReverse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);

        PrintLinkedList.printReverseRecursively(list);

        PrintLinkedList.printReverseByStack(list);
    }
}
