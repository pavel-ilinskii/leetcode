package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSizeSubarraySumTest {

    private static final MinimumSizeSubarraySum subject = new MinimumSizeSubarraySum();

    @Test
    void requirement_1() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int ans = subject.minSubArrayLen(target, nums);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_2() {
        int[] nums = {1, 4, 4};
        int target = 4;
        int ans = subject.minSubArrayLen(target, nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int ans = subject.minSubArrayLen(target, nums);
        assertThat(ans).isEqualTo(0);
    }
}
