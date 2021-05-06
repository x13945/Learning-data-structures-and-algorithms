package org.lstec.algorithm.binary_search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void findExistIndex() {
        // begin
        assertTrue(BinarySearch.findExistIndex(new int[]{1, 2, 5}, 1));
        // end
        assertTrue(BinarySearch.findExistIndex(new int[]{1, 2, 5}, 5));
        // middle
        assertTrue(BinarySearch.findExistIndex(new int[]{1, 2, 5}, 2));
    }

    @Test
    public void notFind() {
        // empty
        assertFalse(BinarySearch.findExistIndex(new int[]{}, 1));
        // not exist
        assertFalse(BinarySearch.findExistIndex(new int[]{1, 2, 5}, 3));
    }
}