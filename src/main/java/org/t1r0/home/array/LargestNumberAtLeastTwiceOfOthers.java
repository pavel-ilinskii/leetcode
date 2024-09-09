package org.t1r0.home.array;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;
        int secondMax = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        if (max >= 2 * secondMax) {
            return maxIndex;
        }

        return -1;
    }
}
