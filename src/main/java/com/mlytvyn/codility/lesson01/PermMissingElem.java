package com.mlytvyn.codility.lesson01;

/**
 * Created by michael on 6/25/14.
 *
 * https://codility.com/demo/take-sample-test/perm_missing_elem
 */
public class PermMissingElem {

    public int solution(int[] A) {
        long expectedSum = 0l;
        long originalSum = 0l;
        for (int i = 0; i < A.length; i++) {
            originalSum += A[i];
            expectedSum += i+1;
        }
        expectedSum += A.length+1;
        return (int) (expectedSum - originalSum);
    }
}
