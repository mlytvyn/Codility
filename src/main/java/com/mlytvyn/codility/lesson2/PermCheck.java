package com.mlytvyn.codility.lesson2;

/**
 * Created by michael on 6/25/14.
 *
 * A non-empty zero-indexed array A consisting of N integers is given.
 A permutation is a sequence containing each element from 1 to N once, and only once.
 For example, array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 is a permutation, but array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 is not a permutation.
 The goal is to check whether array A is a permutation.
 Write a function:
 class Solution { public int solution(int[] A); }
 that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 For example, given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 the function should return 1.
 Given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 the function should return 0.
 Assume that:
 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [1..1,000,000,000].
 Complexity:
 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
public class PermCheck {

    public static void main(String... args) {
        PermCheck pc = new PermCheck();
        //int[] A = {4, 1, 3, 2};
        //int[] A = {3, 1, 2};
        int[] A = { 1, 2, 3, 4, 4};
        System.out.println(pc.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = A[0];
        int max = A[0];
        long sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        //int leftSum = ((1 + A.length) * A.length ) / 2;
        long toMinSum = ((1 + min) * min) / 2;
        long toMaxSum = ((1 + max) * max) / 2;
        //System.out.println(leftSum);
        //System.out.println(toMinSum);
        //System.out.println(toMaxSum);
        //System.out.println();
        //System.out.println(sum);
        //System.out.println(toMaxSum - toMinSum);

        //System.out.println(sum + toMinSum - toMaxSum - min);
        return  (sum + toMinSum - toMaxSum - min) == 0 ? 1 : 0;
    }
}
