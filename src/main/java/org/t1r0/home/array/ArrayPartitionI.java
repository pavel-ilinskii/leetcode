package org.t1r0.home.array;

import java.util.Arrays;

/**
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}
