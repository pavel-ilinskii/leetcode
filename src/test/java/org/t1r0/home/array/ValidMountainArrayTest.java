package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidMountainArrayTest {

    private final ValidMountainArray subject = new ValidMountainArray();

    @Test
    void requirement_1() {
        int[] arr = {2, 1};
        boolean ans = subject.validMountainArray(arr);
        assertThat(ans).isFalse();
    }

    @Test
    void requirement_2() {
        int[] arr = {3, 5, 5};
        boolean ans = subject.validMountainArray(arr);
        assertThat(ans).isFalse();
    }

    @Test
    void requirement_3() {
        int[] arr = {0, 3, 2, 1};
        boolean ans = subject.validMountainArray(arr);
        assertThat(ans).isTrue();
    }

    @Test
    void requirement_4() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean ans = subject.validMountainArray(arr);
        assertThat(ans).isFalse();
    }

    @Test
    void requirement_5() {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        boolean ans = subject.validMountainArray(arr);
        assertThat(ans).isFalse();
    }
}
