package com.mlytvyn.codility.lesson02;

/**
 * Created by mlytvyn on 7/4/14.
 *
 * https://codility.com/demo/take-sample-test/frog_river_one
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] path = new int[A.length];
        long sum = 0l;
        long expectedSum = ((1l + X) * X) / 2;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) {
                return -1;
            }
            if (path[A[i] - 1] == 0) {
                sum += A[i];
            }
            if (expectedSum == sum) {
                return i;
            }
            path[A[i] - 1] = 1;
        }
        return -1;
    }

}
