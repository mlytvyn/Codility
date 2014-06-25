package com.mlytvyn.codility.lesson01;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by michael on 6/25/14.
 */
public class TapeEquilibriumTest {

    private TapeEquilibrium testClass;
    private static final int success = 1;
    private static final int fail = 0;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new TapeEquilibrium();
    }

    @Test(groups = "example")
    public void testSolution() throws Exception {
        int[] A = {3, 1, 2, 4, 3};
        assertEquals(testClass.solution(A), success);
    }
}
