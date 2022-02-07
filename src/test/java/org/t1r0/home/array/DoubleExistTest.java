package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleExistTest {

    private DoubleExist subject = new DoubleExist();

    @Test
    void requirements_1() {
        int[] arr = {10, 2, 5, 3};
        boolean ans = subject.checkIfExist(arr);
        assertThat(ans).isTrue();
    }

    @Test
    void requirements_2() {
        int[] arr = {7, 1, 14, 11};
        boolean ans = subject.checkIfExist(arr);
        assertThat(ans).isTrue();
    }

    @Test
    void requirements_3() {
        int[] arr = {3, 1, 7, 11};
        boolean ans = subject.checkIfExist(arr);
        assertThat(ans).isFalse();
    }
}
