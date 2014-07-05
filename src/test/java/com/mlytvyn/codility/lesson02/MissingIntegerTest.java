package com.mlytvyn.codility.lesson02;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mlytvyn on 7/5/14.
 */
public class MissingIntegerTest {

    private MissingInteger testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new MissingInteger();
    }

    @Test
    public void testSolution() throws Exception {
        int[] A = {1, 3, 6, 4, 1, 2};
        Assert.assertEquals(testClass.solution(A), 5);
    }

    @Test
    public void testTwoMissingInts() throws Exception {
        int[] A = {1, 3, 6, 1, 4, 2, 7, 9, 3};
        // 5, 8
        Assert.assertEquals(testClass.solution(A), 5);
    }

    @Test
    public void testOneElement() throws Exception {
        int[] A = {2};
        Assert.assertEquals(testClass.solution(A), 1);
    }

    @Test
    public void testOne() throws Exception {
        int[] A = {1};
        Assert.assertEquals(testClass.solution(A), 2);
    }

    @Test
    public void testSimple() throws Exception {
        int[] A = {4, 5, 6, 2};
        Assert.assertEquals(testClass.solution(A), 1);
    }

    @Test
    public void testExtremeMaxMinInt() throws Exception {
        int[] A = {1, 2, 3, 1, 1, 2, 4, 5, -2147483648, 2147483647};
        Assert.assertEquals(testClass.solution(A), 6);
    }

    @Test
    public void testPositiveOnly() throws Exception {
        int[] A = new int[200];
        for (int i = 0; i <= 100; i++) {
            A[i] = i;
        }
        for (int i = 102; i < 200; i++) {
            A[i] = i;
        }
        Assert.assertEquals(testClass.solution(A), 101);
    }
}
