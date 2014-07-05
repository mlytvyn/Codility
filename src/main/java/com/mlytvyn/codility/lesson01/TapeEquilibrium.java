package com.mlytvyn.codility.lesson01;

/**
 * Created by michael on 6/25/14.
 *
 * https://codility.com/demo/take-sample-test/tape_equilibrium
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        int diff;
        for (int i = 0; i < A.length -1; i++) {
            leftSum += A[i];
            diff = leftSum - (sum - leftSum);
            if (diff < 0) {
                diff *= -1;
            }
            if (minDiff > diff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
