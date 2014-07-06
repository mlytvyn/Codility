package com.mlytvyn.codility.lesson03;

/**
 * Created by mlytvyn on 7/6/14.
 * <p/>
 * https://codility.com/demo/take-sample-test/passing_cars
 */
public class PassingCars {

    private final static int MAX_PASSING_CARS = 1000000000;

    public int solution(int[] A) {
        // write your code in Java SE 8
        int numberOfPassingCars = 0;
        int r = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                r++;
            } else if (A[i] == 0) {
                numberOfPassingCars += r;
            }
        }
        return numberOfPassingCars > MAX_PASSING_CARS || numberOfPassingCars < 0 ? -1 : numberOfPassingCars;
    }
}
