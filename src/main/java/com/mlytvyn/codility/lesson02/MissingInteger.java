package com.mlytvyn.codility.lesson02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mlytvyn on 7/5/14.
 * <p/>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.
 * For example, given:
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * the function should return 5.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * <p/>
 * int[] A = {1, 3, 6, 1, 4, 2, 7, 9, 3};
 */
public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = 1;
        Set<Integer> mins = new TreeSet<Integer>();
        Set<Integer> all = new HashSet<Integer>();

        mins.add(min);
        for (int a : A) {
            all.add(a);
            if (a > mins.iterator().next()) {
                min = a + 1;
                mins.add(min);
            } else if (a == min) {
                min++;
                mins.add(min);
            }
        }
        mins.removeAll(all);
        return mins.iterator().next();
    }

}
