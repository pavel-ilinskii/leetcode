package org.t1r0.home.array;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * <p>
 * Return any array that satisfies this condition
 */
public class SortByParity {

    public int[] sortArrayByParity(int[] nums) {
        if (nums.length > 1) {
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    int tmp = nums[j];
                    nums[j++] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        return nums;
    }
}
