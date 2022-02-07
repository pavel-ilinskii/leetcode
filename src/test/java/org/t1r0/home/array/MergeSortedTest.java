package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedTest {

    private MergeSorted subject = new MergeSorted();

    @Test
    void requirements_1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        subject.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(expected);
    }

    @Test
    void requirements_2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        subject.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(expected);
    }

    @Test
    void requirements_3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        subject.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(expected);
    }
}
