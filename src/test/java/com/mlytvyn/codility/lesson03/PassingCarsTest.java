package com.mlytvyn.codility.lesson03;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mlytvyn on 7/6/14.
 */
public class PassingCarsTest {

    private PassingCars testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new PassingCars();
    }

    @Test
    public void testSolution() throws Exception {
        int[] A = {0, 1, 0, 1, 1};
        // (0,1), (0,3), (0,4), (2, 3), (2,4)
        Assert.assertEquals(testClass.solution(A), 5);
    }
}
