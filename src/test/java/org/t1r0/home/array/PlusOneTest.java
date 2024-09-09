package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {

    private final PlusOne subject = new PlusOne();

    @Test
    void requirement_1() {
        int[] digits = new int[]{1, 2, 3};
        int[] ans = subject.plusOne(digits);
        assertThat(ans).containsExactly(1, 2, 4);
    }

    @Test
    void requirement_2() {
        int[] digits = new int[]{4, 3, 2, 1};
        int[] ans = subject.plusOne(digits);
        assertThat(ans).containsExactly(4, 3, 2, 2);
    }

    @Test
    void requirement_3() {
        int[] digits = new int[]{9};
        int[] ans = subject.plusOne(digits);
        assertThat(ans).containsExactly(1, 0);
    }
}
