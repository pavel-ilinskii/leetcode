package org.t1r0.home.array;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int insert = nums.length - 1;
        for (int i = 0; i <= insert; i++) {
            if (nums[i] == val) {
                while (nums[insert] == val && insert > i) {
                    insert--;
                }
                nums[i] = nums[insert];
                insert--;
            }
        }
        return insert + 1;
    }
}
