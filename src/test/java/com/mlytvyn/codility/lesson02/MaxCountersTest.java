package com.mlytvyn.codility.lesson02;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by mlytvyn on 7/5/14.
 */
public class MaxCountersTest {

    private MaxCounters testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new MaxCounters();
    }

    @Test
    public void testSolution() throws Exception {
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] expected = {3, 2, 2, 4, 2};
        int[] actual = testClass.solution(N, A);
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwoMaxCounters() throws Exception {
        int N = 5;
        int[] A = {4, 4, 4, 6, 2, 6, 4, 4, 1, 1, 1};
        int[] expected = {7, 4, 4, 6, 4};
        int[] actual = testClass.solution(N, A);
        Assert.assertEquals(actual, expected);
    }
}
