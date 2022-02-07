package org.t1r0.home.array;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int len = nums.length;
        for (int i = 0, j = 1; j < nums.length; i++) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
                len--;
            }
            if (j < nums.length) {
                nums[i + 1] = nums[j++];
            }
        }
        return len;
    }
}
