package com.mlytvyn.codility.lesson02;

/**
 * Created by mlytvyn on 7/5/14.
 *
 * https://codility.com/demo/take-sample-test/max_counters
 */
public class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int[] empty = new int[N];
        int maxCounter = 0;
        int maxTotalCounter = 0;
        for (int k : A) {
            if (k >= 1 && k <= N) {
                int x = k - 1;
                counters[x]++;
                if (maxCounter < counters[x]) {
                    maxCounter = counters[x];
                }
            }
            if (k == N + 1) {
                System.arraycopy(empty, 0, counters, 0, counters.length);
                maxTotalCounter += maxCounter;
                maxCounter = 0;
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] += maxTotalCounter;
        }
        return counters;
    }
}
