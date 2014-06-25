package com.mlytvyn.codility;

/**
 * Created by michael on 6/24/14.
 *
 * This is a demo task. You can read about this task and its solutions in this blog post (http://blog.codility.com/2011/03/solutions-for-task-equi.html).
 A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
 A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
 Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
 For example, consider the following array A consisting of N = 7 elements:
 A[0] = -7   A[1] =  1   A[2] = 5
 A[3] =  2   A[4] = -4   A[5] = 3
 A[6] =  0
 P = 3 is an equilibrium index of this array, because:
 A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 P = 6 is also an equilibrium index, because:
 A[0] + A[1] + A[2] + A[3] + A[4] + A[5] = 0
 and there are no elements with indices greater than 6.
 P = 7 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.
 Write a function
 class Solution { public int solution(int[] A); }
 that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
 Assume that:
 N is an integer within the range [0..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 For example, given array A such that
 A[0] = -7   A[1] =  1   A[2] = 5
 A[3] =  2   A[4] = -4   A[5] = 3
 A[6] =  0
 the function may return 3 or 6, as explained above.
 Complexity:
 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */

/**
 * Score 100 of 100
 */
public class EquilibriumIndex {

    public static void main(String... args) {
        EquilibriumIndex ei = new EquilibriumIndex();
        //int[] A = {-7, 1, 5, 2, -4, 3, 0};
        //int[] A = {-1, -1, 1};
        //int[] A = {0};
        //int[] A = {-2147483648};
        int[] A = {500, 1, -2, -1, 2};

        int result = ei.solution(A);
        System.out.println(String.format("0 <= %s < %s", result, A.length));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = -1;

        long sum = 0l;
        for (int a : A) {
            sum += a;
        }
        //System.out.println(sum);
        long secondSum;
        long firstSum = 0l;
        for (int i = 0; i < A.length; i++) {
            secondSum = sum - firstSum - A[i];
            //System.out.println((i+1) + ": " + firstSum + " ~ " + (secondSum));
            if (firstSum - secondSum == 0) {
                result = i;
                //System.out.println("result: " + result);
            }
            firstSum += A[i];
        }

        return result;
    }

}
