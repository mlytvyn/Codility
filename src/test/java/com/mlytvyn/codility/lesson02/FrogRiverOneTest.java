package com.mlytvyn.codility.lesson02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by mlytvyn on 7/4/14.
 */
public class FrogRiverOneTest {

    private static final int fail = -1;
    private FrogRiverOne testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new FrogRiverOne();
    }

    @Test
    public void testSolution() throws Exception {
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        assertEquals(testClass.solution(X, A), 6);
    }

    @Test
    public void testSingleELement() throws Exception {
        int X = 1;
        int[] A = {2};
        assertEquals(testClass.solution(X, A), fail);
    }

    @Test
    public void testLargePermutation() throws Exception {
        int X = 90000;
        int[] A = new int[1000000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        assertEquals(testClass.solution(X, A), 89999);
    }
}
