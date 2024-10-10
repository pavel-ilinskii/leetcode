package org.t1r0.home.binarysearch;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x < 2) return x;

        double x0 = x;
        double x1 = (x0 + x / x0) / 2.0;
        while (Math.abs(x0 - x1) >= 1) {
            x0 = x1;
            x1 = (x0 + x / x0) / 2.0;
        }

        return (int) x1;
    }
}
