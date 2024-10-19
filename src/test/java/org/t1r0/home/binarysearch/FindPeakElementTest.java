package org.t1r0.home.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPeakElementTest {

    private static final FindPeakElement subject = new FindPeakElement();

    @Test
    void requirement_1() {
        int[] nums = {1, 2, 3, 1};
        int ans = subject.findPeakElement(nums);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int ans = subject.findPeakElement(nums);
        assertThat(ans).isEqualTo(5);
    }

    @Test
    void requirement_3() {
        int[] nums = {0};
        int ans = subject.findPeakElement(nums);
        assertThat(ans).isEqualTo(0);
    }

    @Test
    void requirement_4() {
        int[] nums = {1, 2};
        int ans = subject.findPeakElement(nums);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_5() {
        int[] nums = {3, 1, 2};
        int ans = subject.findPeakElement(nums);
        assertThat(ans).isEqualTo(2);
    }
}
