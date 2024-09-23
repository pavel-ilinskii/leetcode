package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KLargestElementInArrayTest {

    private static final KLargestElementInArray subject = new KLargestElementInArray();

    @Test
    void requirement_1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans = subject.findKthLargest(nums, k);
        assertThat(ans).isEqualTo(5);
    }

    @Test
    void requirement_2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int ans = subject.findKthLargest(nums, k);
        assertThat(ans).isEqualTo(4);
    }
}
