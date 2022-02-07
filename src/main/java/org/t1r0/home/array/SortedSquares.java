package org.t1r0.home.array;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * O(n) solution
 */
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int pivot = 0;

        while (pivot < nums.length && nums[pivot] < 0) pivot++;

        int right = pivot;
        int left = pivot - 1;

        while (right < nums.length || left > -1) {
            if (right < nums.length) {
                if (left > -1) {
                    if (nums[right] >= -nums[left]) {
                        ans[i++] = nums[left] * nums[left];
                        left--;
                    } else {
                        ans[i++] = nums[right] * nums[right];
                        right++;
                    }
                } else {
                    ans[i++] = nums[right] * nums[right];
                    right++;
                }
            } else {
                ans[i++] = nums[left] * nums[left];
                left--;
            }
        }
        return ans;
    }
}
