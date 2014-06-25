package com.mlytvyn.codility.lesson01;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by michael on 6/25/14.
 */
public class PermMissingElemTest {

    PermMissingElem testClass;

    @BeforeMethod
    public void setUp() throws Exception {
        testClass = new PermMissingElem();
    }

    @Test
    public void solution() {
        int[] A = {3, 1, 2, 5};
        int actual = testClass.solution(A);
        Assert.assertEquals(actual, 4);
        if (actual < 0 || actual >A.length) {
            Assert.assertTrue(false);
        }
    }
}
