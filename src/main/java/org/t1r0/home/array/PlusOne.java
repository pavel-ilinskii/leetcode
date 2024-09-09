package org.t1r0.home.array;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean plus = true;

        int curr = digits.length;

        while (--curr >= 0 && plus) {
            if (digits[curr] == 9) {
                digits[curr] = 0;
            } else {
                digits[curr] += 1;
                plus = false;
            }
        }

        if (plus) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }

        return digits;
    }
}
