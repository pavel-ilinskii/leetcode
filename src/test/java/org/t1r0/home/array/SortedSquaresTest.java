package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedSquaresTest {

    private SortedSquares subject = new SortedSquares();

    @Test
    void requirements() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] ans = subject.sortedSquares(nums);
        assertThat(ans).containsExactly(expected);
    }
}
