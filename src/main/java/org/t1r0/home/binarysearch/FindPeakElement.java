package org.t1r0.home.binarysearch;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given a 0-indexed integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
