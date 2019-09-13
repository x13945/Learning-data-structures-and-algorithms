package question_5;

import org.junit.jupiter.api.Test;

class PrintLinkedListTest {

    @Test
    void printReverse() {
        XLinkedList<Integer> list = new XLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);

        PrintLinkedList.printReverseRecursively(list);

        PrintLinkedList.printReverseByStack(list);
    }
}
