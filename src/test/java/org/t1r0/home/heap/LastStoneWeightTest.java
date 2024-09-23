package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LastStoneWeightTest {

    private static final LastStoneWeight subject = new LastStoneWeight();

    @Test
    void requirements_1() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int ans = subject.lastStoneWeight(stones);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirements_2() {
        int[] stones = {1};
        int ans = subject.lastStoneWeight(stones);
        assertThat(ans).isEqualTo(1);
    }
}
