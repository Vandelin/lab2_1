package edu.iis.mto.bsearch;

import junit.extensions.TestSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void searchTestSeqLenghtOneFound() {
        int[] seq = {123};
        SearchResult sr = BinarySearch.search(123, seq);
        Assert.assertTrue(sr.isFound());
    }


}