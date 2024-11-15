package org.t1r0.home.hashtable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {

    private static final IntersectionOfTwoArrays subject = new IntersectionOfTwoArrays();

    @Test
    void requirements_1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = subject.intersection(nums1, nums2);
        assertThat(ans).containsExactly(2);
    }

    @Test
    void requirements_2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] ans = subject.intersection(nums1, nums2);
        assertThat(ans).containsOnly(9, 4);
    }
}
