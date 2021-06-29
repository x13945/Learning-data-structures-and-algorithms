package org.lstec.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPathTest {

    @Test
    public void main() {
        FindPath.main(new String[1]);
    }

    @Test
    public void findPath() {
        FindPath.Node i = new FindPath.Node('i');
        FindPath.Node d = new FindPath.Node('d');
        FindPath.Node j = new FindPath.Node('j');
        FindPath.Node e = new FindPath.Node('e');
        FindPath.Node b = new FindPath.Node('b');
        FindPath.Node f = new FindPath.Node('f');
        FindPath.Node g = new FindPath.Node('g');
        FindPath.Node c = new FindPath.Node('c');
        FindPath.Node h = new FindPath.Node('h');
        FindPath.Node a = new FindPath.Node('a');

        d.left = h;
        d.right = i;

        e.right = j;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        a.left = b;
        a.right = c;

        String path1 = FindPath.findPath(a, i.value);
        String path2 = FindPath.findPath(a, j.value);

        System.out.println(path1);
        System.out.println(path2);
        assertEquals("abdhiejcfg", path1);
        assertEquals("abdhiejcfg", path2);
    }
}