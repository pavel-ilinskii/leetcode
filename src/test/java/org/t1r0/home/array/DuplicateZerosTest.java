package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateZerosTest {

    private DuplicateZeros subject = new DuplicateZeros();

    @Test
    void requirements_1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        subject.duplicateZeros(arr);
        assertThat(arr).containsExactly(expected);
    }

    @Test
    void requirements_2() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        subject.duplicateZeros(arr);
        assertThat(arr).containsExactly(expected);
    }
}
