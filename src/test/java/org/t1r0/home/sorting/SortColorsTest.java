package org.t1r0.home.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortColorsTest {

    private static final SortColors subject = new SortColors();

    @Test
    void requirement_1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        subject.sortColors(nums);
        assertThat(nums).containsExactly(0, 0, 1, 1, 2, 2);
    }

    @Test
    void requirement_2() {
        int[] nums = {2, 0, 1};
        subject.sortColors(nums);
        assertThat(nums).containsExactly(0, 1, 2);
    }
}
