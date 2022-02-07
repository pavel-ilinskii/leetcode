package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes subject = new MaxConsecutiveOnes();

    @Test
    void requirements() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int ans = subject.findMaxConsecutiveOnes(nums);
        assertThat(ans).isEqualTo(3);
    }
}
