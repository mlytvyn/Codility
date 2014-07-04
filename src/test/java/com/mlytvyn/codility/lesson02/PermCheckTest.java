package com.mlytvyn.codility.lesson02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by michael on 6/25/14.
 */
public class PermCheckTest {

    private static final int success = 1;
    private static final int fail = 0;
    private PermCheck testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new PermCheck();
    }

    @Test(groups = "example")
    public void solutionExample1() {
        int[] A = {4, 1, 3, 2};
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "example")
    public void solutionExample2() {
        int[] A = {4, 1, 3};
        assertEquals(testClass.solution(A), fail);
    }

    @Test(groups = "correctness", description = "Single element with maximum value")
    public void solutionExtremeMax() {
        int[] A = {Integer.MAX_VALUE};
        assertEquals(testClass.solution(A), fail);
    }

    @Test(groups = "correctness", description = "Single element")
    public void solutionSingle() {
        int[] A = {7};
        assertEquals(testClass.solution(A), fail);
    }

    @Test(groups = "correctness", description = "Double elements")
    public void solutionDouble() {
        int[] A = {1, 2};
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "correctness", description = "total sum is corret (equals 1 + 2 + ... N), but it is not a permutation, N = 3")
    public void solutionAntiSum1() {
        int[] A = {1, 2, 3};
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "correctness")
    public void solutionAntiSum2_1() {
        int[] A = {1, 6, 3, 3, 4, 4};
        assertEquals(testClass.solution(A), fail);
    }

    @Test(groups = "performance", description = "permutation, N = ~10,000")
    public void solutionMediumPermutation() {
        int[] A = new int[1000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i+1;
        }
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "performance", description = "total sum is correct (equals 1 + 2 + ... N), but it is not a permutation, N = ~100,000")
    /*
    expected {1, 2, 3, 4, 5, 6, 7 ....}
    got      {1, 2, 2, 5, 5, 6, 7 ....}
     */
    public void solutionAntiSum2() {
        int[] A = new int[10000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i+1;
        }
        A[2] = 2;
        A[3] = 5;
        assertEquals(testClass.solution(A), fail);
    }

    @Test(groups = "performance", description = "large permutation, N = ~100,000")
    public void solutionLargePermutation() {
        int[] A = new int[10000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i+1;
        }
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "performance", description = "sequence 1, 2, ..., N, N = ~100,000")
    public void solutionLargeRange() {
        int[] A = new int[10000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i+1;
        }
        assertEquals(testClass.solution(A), success);
    }

    @Test(groups = "performance", description = "all the same values, N = ~100,000")
    public void solutionExtremeValues() {
        int[] A = new int[10000];
        for (int i = 0; i < A.length; i++) {
            A[i] = 1000000000;
        }
        assertEquals(testClass.solution(A), fail);
    }
}
