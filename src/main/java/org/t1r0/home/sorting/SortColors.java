package org.t1r0.home.sorting;

/**
 * Given an array nums with n objects colored red, white, or blue,
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int num : nums) {
            if (num == 0) {
                red++;
            } else if (num == 1) {
                white++;
            } else if (num == 2) {
                blue++;
            }
        }

        int curr = 0;

        for (int i = 0; i < red; i++) {
            nums[curr++] = 0;
        }
        for (int i = 0; i < white; i++) {
            nums[curr++] = 1;
        }
        for (int i = 0; i < blue; i++) {
            nums[curr++] = 2;
        }
    }
}
