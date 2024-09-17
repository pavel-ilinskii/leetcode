package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumIITest {

    private static final TwoSumII subject = new TwoSumII();

    @Test
    void requirement_1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ans = subject.twoSum(numbers, target);
        assertThat(ans).containsExactly(1, 2);
    }

    @Test
    void requirement_2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] ans = subject.twoSum(numbers, target);
        assertThat(ans).containsExactly(1, 3);
    }

    @Test
    void requirement_3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] ans = subject.twoSum(numbers, target);
        assertThat(ans).containsExactly(1, 2);
    }

}
