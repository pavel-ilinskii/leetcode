package org.t1r0.home.array;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int write = 0;
            int read = 1;
            while (write < nums.length - 1 && read < nums.length) {
                if (nums[write] != 0) write++;
                if (nums[read] == 0 || read == write) read++;
                if (nums[write] == 0 && read < nums.length) {
                    nums[write] = nums[read];
                    nums[read] = 0;
                }
            }
        }
    }
}
