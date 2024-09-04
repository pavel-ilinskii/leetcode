package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThirdMaximumNumberTest {

    private final ThirdMaximumNumber subject = new ThirdMaximumNumber();

    @Test
    void requirement_1() {
        int[] nums = {3, 2, 1};
        int ans = subject.thirdMax(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_2() {
        int[] nums = {1, 2};
        int ans = subject.thirdMax(nums);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_3() {
        int[] nums = {2, 2, 3, 1};
        int ans = subject.thirdMax(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_4() {
        int[] nums = {1, 2, 2};
        int ans = subject.thirdMax(nums);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_5() {
        int[] nums = {1, 2, -2147483648};
        int ans = subject.thirdMax(nums);
        assertThat(ans).isEqualTo(-2147483648);
    }
}
