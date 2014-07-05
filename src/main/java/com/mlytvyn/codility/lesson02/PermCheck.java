package com.mlytvyn.codility.lesson02;

/**
 * Created by michael on 6/25/14.
 *
 * https://codility.com/demo/take-sample-test/perm_check
 */
public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        int count = 0;
        int val;
        for (int i = 0; i < A.length; i++, count++) {
            val = A[i] - 1;
            if (val >= A.length || B[val] != 0) {
                return 0;
            }
            B[val] = A[i];
        }

        return count == A.length ? 1 : 0;
    }
}
