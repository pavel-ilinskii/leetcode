package org.t1r0.home.hashtable;

import java.util.HashSet;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        var set = new HashSet<Integer>();
        while (true) {
            if (n == 1) return true;
            if (set.contains(n)) return false;
            set.add(n);
            n = digitSquares(n);
        }
    }

    private int digitSquares(int n) {
        int digit = n % 10;
        int sum = (digit * digit);
        if (digit != n) sum += digitSquares(n / 10);
        return sum;
    }
}
