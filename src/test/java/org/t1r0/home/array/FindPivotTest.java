package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPivotTest {

    private final FindPivot subject = new FindPivot();

    @Test
    void requirement_1() {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(3);
    }

    @Test
    void requirement_2() {
        int[] nums = new int[]{1, 2, 3};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(-1);
    }

    @Test
    void requirement_3() {
        int[] nums = new int[]{2, 1, -1};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(0);
    }

    @Test
    void requirement_4() {
        int[] nums = new int[]{-1, -1, -1, -1, -1, 0};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_5() {
        int[] nums = new int[]{-1, -1, 0, 1, 1, 0};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(5);
    }

    @Test
    void requirement_6() {
        int[] nums = new int[]{-1, -1, -1, 1, 1, 1};
        int ans = subject.pivotIndex(nums);
        assertThat(ans).isEqualTo(-1);
    }
}
