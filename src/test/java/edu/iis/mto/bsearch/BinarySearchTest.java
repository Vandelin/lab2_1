package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class BinarySearchTest {

    @Test
    public void searchTestSeqLenghtOneFound() {
        int[] seq = {123};
        SearchResult sr = BinarySearch.search(123, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }

    @Test
    public void searchTestSeqLenghtOneNotFound() {
        int[] seq = {1};
        SearchResult sr = BinarySearch.search(123, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test
    public void searchTestElementIsFirstInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertThat(sr.isFound(), is(true));
        Assert.assertThat(sr.getPosition(), is(1));
    }

    @Test
    public void searchTestElementIsLastInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(sr.isFound(), is(true));
        Assert.assertThat(sr.getPosition(), is(8));
    }

    @Test
    public void searchTestElementIsMiddleInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6};
        SearchResult sr = BinarySearch.search(3, seq);
        Assert.assertThat(sr.isFound(), is(true));
        Assert.assertThat(sr.getPosition(), is(4));
    }

    @Test
    public void searchTestElementIsNotFoundInSeqLongerThanOne() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6};
        SearchResult sr = BinarySearch.search(21, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    //Algorithm checks weak sides of this code.
}