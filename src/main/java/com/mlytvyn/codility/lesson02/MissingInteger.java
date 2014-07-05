package com.mlytvyn.codility.lesson02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mlytvyn on 7/5/14.
 *
 * https://codility.com/demo/take-sample-test/missing_integer
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
