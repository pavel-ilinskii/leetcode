package org.t1r0.home.binarysearch;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class MinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    int findMin(int[] nums, int l, int r) {
        if (l == r) return nums[l];
        if (l + 1 == r) return Math.min(nums[l], nums[r]);
        int mid = l + (r - l) / 2;
        if (nums[mid] < nums[mid - 1]) return nums[mid];
        if (nums[mid] > nums[r]) return findMin(nums, mid + 1, r);
        return findMin(nums, l, mid - 1);
    }
}
