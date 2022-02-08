package org.t1r0.home.array;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 */
public class ReplaceRightGreatest {

    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i > -1; i--) {
            int tmp = arr[i];
            arr[i] = max;
            if (tmp > max) {
                max = tmp;
            }
        }
        return arr;
    }
}
