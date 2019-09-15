package question_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructBinaryTreeTest {

    @Test
    void construct() {
        int[] preOrder1 = {1, 2, 4, 5, 3, 6, 7};
        int[] inOrder1 = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode root1 = ConstructBinaryTree.construct(preOrder1, inOrder1);
        assertEquals(2, root1.getLeft().getValue());
        assertEquals(3, root1.getRight().getValue());

        BinaryTreeNode root2 = new BinaryTreeNode(1, new BinaryTreeNode(2, new BinaryTreeNode(4), new BinaryTreeNode(5)), new BinaryTreeNode(3, new BinaryTreeNode(6), new BinaryTreeNode(7)));
        assertEquals(root1, root2);
    }
}
