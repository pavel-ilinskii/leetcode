package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {

    private static final RotateArray subject = new RotateArray();

    @Test
    void requirement_1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        subject.rotate(nums, k);
        assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
    }

    @Test
    void requirement_2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        subject.rotate(nums, k);
        assertThat(nums).containsExactly(3, 99, -1, -100);
    }

    @Test
    void requirement_3() {
        int[] nums = {-1};
        int k = 2;
        subject.rotate(nums, k);
        assertThat(nums).containsExactly(-1);
    }
}
