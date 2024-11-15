package org.t1r0.home.hashtable;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        Arrays.stream(nums1).forEach(set::add);
        Arrays.stream(nums2).forEach(num -> {
                    if (set.contains(num)) ans.add(num);
                }
        );

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
