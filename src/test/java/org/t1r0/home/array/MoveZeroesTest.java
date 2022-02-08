package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {

    private static final MoveZeroes subject = new MoveZeroes();

    @Test
    void requirement_1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }

    @Test
    void requirement_2() {
        int[] nums = {0};
        int[] expected = {0};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }

    @Test
    void break_1() {
        int[] nums = {2, 1};
        int[] expected = {2, 1};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }

    @Test
    void break_2() {
        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        int[] expected = {4, 2, 4, 3, 5, 1, 0, 0, 0, 0};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }

    @Test
    void break_3() {
        int[] nums = {1, 0};
        int[] expected = {1, 0};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }

    @Test
    void break_4() {
        int[] nums = {0, 1};
        int[] expected = {1, 0};
        subject.moveZeroes(nums);
        assertThat(nums).containsExactly(expected);
    }
}
