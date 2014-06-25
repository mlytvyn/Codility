package com.mlytvyn.codility.lesson02;

/**
 * Created by michael on 6/25/14.
 *
 * A non-empty zero-indexed array A consisting of N integers is given.
 A permutation is a sequence containing each element from 1 to N once, and only once.
 For example, array A such that:
 A = {4, 1, 3, 2}
 is a permutation, but array A such that:
 A = {4, 1, 3}
 is not a permutation.
 */
public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = A[0];
        int max = A[0];
        long sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            if (min == A[i] || max == A[i]) {
                return 0;
            }
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        if (min > 1) {
            return 0;
        }
        long toMinSum = ((1 + min) * min) / 2;
        long toMaxSum = ((1 + max) * max) / 2;

        return  (sum + toMinSum - toMaxSum - min) == 0 ? 1 : 0;
    }
}
