package org.t1r0.home.array;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int i = 1;
        boolean up = false;
        boolean down = false;

        for (; i < arr.length && arr[i] > arr[i - 1]; i++) up = true;
        for (; i < arr.length && arr[i] < arr[i - 1]; i++) down = true;

        return up && down && i == arr.length;
    }
}
