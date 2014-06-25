package com.mlytvyn.codility.lesson01;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by michael on 6/25/14.
 */
public class FrogJmpTest {

    FrogJmp testClass;
    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new FrogJmp();
    }

    @Test
    public void testSolution() throws Exception {
        int X = 10;
        int Y = 85;
        int D = 30;
        Assert.assertEquals(testClass.solution(X, Y, D), 3);
    }
}
