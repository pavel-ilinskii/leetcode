package org.t1r0.home.array;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindEvenNumbers {

    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int digit = 0;
            while (num != 0) {
                num = num / 10;
                digit++;
            }
            if (digit % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}
