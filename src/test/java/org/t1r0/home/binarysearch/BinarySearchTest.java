package org.t1r0.home.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    public static final BinarySearch subject = new BinarySearch();

    @Test
    void requirement_1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int ans = subject.search(nums, target);
        assertThat(ans).isEqualTo(4);
    }

    @Test
    void requirement_2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int ans = subject.search(nums, target);
        assertThat(ans).isEqualTo(-1);
    }
}
