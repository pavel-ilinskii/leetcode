package org.t1r0.home.array;

/**
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, ans = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }

            right++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
