package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumCostConnectSticksTest {

    public static final MinimumCostConnectSticks subject = new MinimumCostConnectSticks();

    @Test
    void requirement_1() {
        int[] sticks = {2, 4, 3};
        int ans = subject.connectSticks(sticks);
        assertThat(ans).isEqualTo(14);
    }

    @Test
    void requirement_2() {
        int[] sticks = {1, 8, 3, 5};
        int ans = subject.connectSticks(sticks);
        assertThat(ans).isEqualTo(30);
    }

    @Test
    void requirement_3() {
        int[] sticks = {5};
        int ans = subject.connectSticks(sticks);
        assertThat(ans).isEqualTo(0);
    }
}
