package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TopKFrequentElementsTest {

    private static final TopKFrequentElements subject = new TopKFrequentElements();

    @Test
    void requirement_1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = subject.topKFrequent(nums, k);
        assertThat(ans).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void requirement_2() {
        int[] nums = {1};
        int k = 1;
        int[] ans = subject.topKFrequent(nums, k);
        assertThat(ans).containsExactlyInAnyOrder(1);
    }

    @Test
    void requirement_3() {
        int[] nums = {-1, -1};
        int k = 1;
        int[] ans = subject.topKFrequent(nums, k);
        assertThat(ans).containsExactlyInAnyOrder(-1);
    }
}
