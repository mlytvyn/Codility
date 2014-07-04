package com.mlytvyn.codility.lesson02;

/**
 * Created by mlytvyn on 7/4/14.
 * A small frog wants to get to the other side of a river. The frog is currently located at position 0, and wants to get to position X. Leaves fall from a tree onto the surface of the river.
 * You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in minutes.
 * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X.
 * For example, you are given integer X = 5 and array A such that:
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * In minute 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
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
