package org.lstec.algorithm.sort;

import java.security.InvalidParameterException;

public class FindPath {
    public static void main(String[] args) {
        Node i = new Node('i');
        Node d = new Node('d');
        Node j = new Node('j');
        Node e = new Node('e');
        Node b = new Node('b');
        Node f = new Node('f');
        Node g = new Node('g');
        Node c = new Node('c');
        Node h = new Node('h');
        Node a = new Node('a');

        d.left = h;
        d.right = i;

        e.right = j;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        a.left = b;
        a.right = c;

        String path1 = findPath(a, i.value);
        String path2 = findPath(a, j.value);

        System.out.println("Path for i " + path1);
        System.out.println("Path for j " + path2);

        String shorterPath;
        if (path1.length() < path2.length()) {
            shorterPath = path1;
        } else {
            shorterPath = path2;
        }

        char result = '\n';
        for (int k = 0; k < shorterPath.length(); k++) {
            if (path1.charAt(k) != path2.charAt(k)) {
                result = shorterPath.charAt(k - 1);
                break;
            }
        }

        System.out.println("Result is + " + result);
    }

    static String findPath(Node node, char target) {
        if (node.value == target && (node.left == null && node.right == null)) {
            return node.value + "";
        } else {
            String path = node.value + "";
            if (node.left != null) {
                String leftPath = findPath(node.left, target);
                if (leftPath.endsWith("" + target)) {
                    path += leftPath;
                }
            }

            if (node.right != null) {
                String rightPath = findPath(node.right, target);
                if (rightPath.endsWith("" + target)) {
                    path += rightPath;
                }
            }

            return path;
        }
    }

    static class Node {

        Node left;
        Node right;
        char value;

        Node(char value) {
            this.value = value;
        }
    }
}
