package org.t1r0.home.sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumAbsoluteDifferenceTest {

    private static final MinimumAbsoluteDifference subject = new MinimumAbsoluteDifference();

    @Test
    void requirement_1() {
        int[] arr = {4, 2, 1, 3};
        var ans = subject.minimumAbsDifference(arr);
        assertThat(ans).isEqualTo(List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4)));
    }

    @Test
    void requirement_2() {
        int[] arr = {1, 3, 6, 10, 15};
        var ans = subject.minimumAbsDifference(arr);
        assertThat(ans).isEqualTo(List.of(List.of(1, 3)));
    }

    @Test
    void requirement_3() {
        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        var ans = subject.minimumAbsDifference(arr);
        assertThat(ans).isEqualTo(List.of(List.of(-14, -10), List.of(19, 23), List.of(23, 27)));
    }
}
