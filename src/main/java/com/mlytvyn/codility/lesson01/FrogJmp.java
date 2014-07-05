package com.mlytvyn.codility.lesson01;

/**
 * Created by michael on 6/25/14.
 *
 * https://codility.com/demo/take-sample-test/frog_jmp
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jumps = (Y - X) / D;
        if (X + (D * jumps) < Y) {
            jumps++;
        }
        return jumps;
    }
}
