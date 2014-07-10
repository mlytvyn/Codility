package com.mlytvyn.codility.lesson03;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by mlytvyn on 7/10/14.
 */
public class GenomicRangeQueryTest {

    private GenomicRangeQuery testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new GenomicRangeQuery();
    }

    @Test
    public void testSolution() throws Exception {
        // Impact factors
        // A - 1
        // C - 2
        // G - 3
        // T - 4
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        int[] expected = {2, 4, 1};
        int[] actual = testClass.solution(S, P, Q);
        System.out.println(Arrays.toString(actual));
        Assert.assertEquals(actual, expected);
    }
}
