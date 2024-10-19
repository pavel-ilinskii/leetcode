package org.t1r0.home.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumInRotatedSortedArrayTest {

    private static final MinimumInRotatedSortedArray subject = new MinimumInRotatedSortedArray();

    @Test
    void requirement_1() {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = subject.findMin(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = subject.findMin(nums);
        assertThat(ans).isEqualTo(0);
    }

    @Test
    void requirement_3() {
        int[] nums = {11, 13, 15, 17};
        int ans = subject.findMin(nums);
        assertThat(ans).isEqualTo(11);
    }

    @Test
    void requirement_4() {
        int[] nums = {3, 1, 2};
        int ans = subject.findMin(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_5() {
        int[] nums = {2, 1};
        int ans = subject.findMin(nums);
        assertThat(ans).isEqualTo(1);
    }
}
