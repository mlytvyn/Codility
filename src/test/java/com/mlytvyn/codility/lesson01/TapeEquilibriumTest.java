package com.mlytvyn.codility.lesson01;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created by michael on 6/25/14.
 */
public class TapeEquilibriumTest {

    private TapeEquilibrium testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new TapeEquilibrium();
    }

    @Test(groups = "example")
    public void example() throws Exception {
        int[] A = {3, 1, 2, 4, 3};
        assertEquals(testClass.solution(A), 1);
    }

    @Test(groups = "correctness", description = "two elements")
    public void testDouble() throws Exception {
        int[] A = {3, 1};
        assertEquals(testClass.solution(A), 2);
    }

    @Test(groups = "correctness", description = "simple test with positive numbers, length = 5")
    public void simple_positive() throws Exception {
        int[] A = {3, 1, 5, 6, 88};
        assertEquals(testClass.solution(A), 73);
    }

    @Test(groups = "correctness", description = "simple test with negative numbers, length = 5")
    public void simple_negative() throws Exception {
        int[] A = {-3, -1, -5, -6, -88};
        assertEquals(testClass.solution(A), 73);
    }
}
