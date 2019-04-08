package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void searchTestSeqLenghtOneFound() {
        int[] seq = {123};
        SearchResult sr = BinarySearch.search(123, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void searchTestSeqLenghtOneNotFound() {
        int[] seq = {1};
        SearchResult sr = BinarySearch.search(123, seq);
        Assert.assertFalse(sr.isFound());
    }

    @Test
    public void searchTestElementIsFirstInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertTrue(sr.isFound());
        Assert.assertEquals(1, sr.getPosition());
    }
}