package com.mlytvyn.codility.lesson03;

/**
 * Created by mlytvyn on 7/9/14.
 *
 * https://codility.com/demo/take-sample-test/genomic_range_query
 */
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        S = S.replaceAll("A", "1").replaceAll("C", "2").replaceAll("G", "3").replaceAll("T", "4");
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            result[i] = getMinimumImpactFactor(S.substring(P[i], Q[i]+1));
        }

        return result;
    }

    private int getMinimumImpactFactor(String subsequence) {
        char minimumImpactFactor = '5';
        for (char nucleotid : subsequence.toCharArray()) {
            if (minimumImpactFactor > nucleotid) {
                minimumImpactFactor = nucleotid;
                if (minimumImpactFactor == '1') {
                    break;
                }
            }
        }
        return minimumImpactFactor - 48;
    }
}
