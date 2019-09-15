package question_6;

import java.security.InvalidParameterException;

public class ConstructBinaryTree {
    public static BinaryTreeNode construct(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null || preOrder.length != inOrder.length) {
            return null;
        }


        return constructImpl(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static BinaryTreeNode constructImpl(int[] preOrder, int startPreOrder, int endPreOrder, int[] inOrder, int startInOrder, int endInOrder) {
        int rootValue = preOrder[startPreOrder];
        BinaryTreeNode root = new BinaryTreeNode();
        root.setValue(rootValue);

        if (startPreOrder == endPreOrder) {
            if (startInOrder == endInOrder) {
                return root;
            } else {
                throw new InvalidParameterException("Invalid input.");
            }
        }

        int rootIndexInOrder = startInOrder;
        while (rootIndexInOrder <= endInOrder && inOrder[rootIndexInOrder] != rootValue) {
            ++rootIndexInOrder;
        }

        if (rootIndexInOrder == endInOrder && inOrder[rootIndexInOrder] != rootValue) {
            throw new InvalidParameterException("Invalid input.");
        }


        int leftLength = rootIndexInOrder - startInOrder;
        int leftPreOrderEnd = leftLength + startPreOrder;
        if (leftLength > 0) {
            // 构建左子树
            root.setLeft(constructImpl(preOrder, startPreOrder + 1, leftPreOrderEnd, inOrder, startInOrder, rootIndexInOrder - 1));
        }
        if (leftLength < endPreOrder - startPreOrder) {
            // 构建右子树
            root.setRight(constructImpl(preOrder, leftPreOrderEnd + 1, endPreOrder, inOrder, rootIndexInOrder + 1, endInOrder));
        }

        return root;
    }
}


