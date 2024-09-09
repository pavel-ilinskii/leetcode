package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LargestNumberAtLeastTwiceOfOthersTest {

    private final LargestNumberAtLeastTwiceOfOthers subject = new LargestNumberAtLeastTwiceOfOthers();

    @Test
    void requirement_1() {
        int[] nums = new int[]{3, 6, 1, 0};
        int ans = subject.dominantIndex(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_2() {
        int[] nums = new int[]{1, 2, 3, 4};
        int ans = subject.dominantIndex(nums);
        assertThat(ans).isEqualTo(-1);
    }

    @Test
    void requirement_3() {
        int[] nums = new int[]{1, 0};
        int ans = subject.dominantIndex(nums);
        assertThat(ans).isEqualTo(0);
    }
}
