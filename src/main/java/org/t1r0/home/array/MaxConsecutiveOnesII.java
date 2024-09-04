package org.t1r0.home.array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 */
public class MaxConsecutiveOnesII {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0, prev = 0, seenZero = 0;

        for (int num : nums) {
            if (num == 0) {
                seenZero = 1;
                prev = curr;
                curr = 0;
            } else {
                curr++;
            }

            max = Math.max(max, curr + prev + seenZero);
        }

        return max;
    }
}
