package org.t1r0.home.array;

import java.util.Arrays;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivot {

    public int pivotIndex(int[] nums) {
        int pivot = 0;
        int sumLeft = 0;
        int sumRight = Arrays.stream(nums).skip(1).sum();

        while (pivot < nums.length - 1) {
            if (sumLeft == sumRight) {
                return pivot;
            }
            sumLeft += nums[pivot];
            pivot++;
            sumRight -= nums[pivot];
        }

        if (sumLeft == 0) {
            return pivot;
        }

        return -1;
    }
}
