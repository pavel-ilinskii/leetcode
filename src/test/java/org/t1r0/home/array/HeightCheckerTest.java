package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HeightCheckerTest {

    private final HeightChecker subject = new HeightChecker();

    @Test
    void requirement_1() {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int ans = subject.heightChecker(heights);
        assertThat(ans).isEqualTo(3);
    }

    @Test
    void requirement_2() {
        int[] heights = {5, 1, 2, 3, 4};
        int ans = subject.heightChecker(heights);
        assertThat(ans).isEqualTo(5);
    }

    @Test
    void requirement_3() {
        int[] heights = {1, 2, 3, 4, 5};
        int ans = subject.heightChecker(heights);
        assertThat(ans).isEqualTo(0);
    }
}
