package org.t1r0.home.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <p>
 * <code>
 * i != j;
 * 0 <= i, j < arr.length;
 * arr[i] == 2 * arr[j];
 * </code>
 */
public class DoubleExist {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>(arr.length);
        for (int j : arr) {
            if (set.contains(j * 2)) {
                return true;
            }
            if (j % 2 == 0 && set.contains(j / 2)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }
}
