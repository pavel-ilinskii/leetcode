package org.t1r0.home.array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                if (ans < count) {
                    ans = count;
                }
            } else {
                count = 0;
            }
        }

        return ans;
    }
}
