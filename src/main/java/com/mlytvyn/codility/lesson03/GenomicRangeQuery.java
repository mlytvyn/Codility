package com.mlytvyn.codility.lesson03;

/**
 * Created by mlytvyn on 7/9/14.
 * <p/>
 * https://codility.com/media/train/3-PrefixSums.pdf
 * <p/>
 * https://codility.com/demo/take-sample-test/genomic_range_query
 */
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] prefixSumMatrix = new int[3][S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            short a = 0, c = 0, g = 0;
            switch (S.charAt(i)) {
                case 'A':
                    a = 1;
                    break;
                case 'C':
                    c = 1;
                    break;
                case 'G':
                    g = 1;
                    break;
                case 'T':
                    // ignore this
                    break;
            }
            prefixSumMatrix[0][i + 1] = prefixSumMatrix[0][i] + a;
            prefixSumMatrix[1][i + 1] = prefixSumMatrix[1][i] + c;
            prefixSumMatrix[2][i + 1] = prefixSumMatrix[2][i] + g;
        }

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i] + 1;
            if (prefixSumMatrix[0][toIndex] - prefixSumMatrix[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (prefixSumMatrix[1][toIndex] - prefixSumMatrix[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (prefixSumMatrix[2][toIndex] - prefixSumMatrix[2][fromIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }
}