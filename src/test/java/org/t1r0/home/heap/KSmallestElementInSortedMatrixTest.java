package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KSmallestElementInSortedMatrixTest {

    private static final KSmallestElementInSortedMatrix subject = new KSmallestElementInSortedMatrix();

    @Test
    void requirement_1() {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        int ans = subject.kthSmallest(matrix, k);
        assertThat(ans).isEqualTo(13);
    }

    @Test
    void requirement_2() {
        int[][] matrix = {{-5}};
        int k = 1;
        int ans = subject.kthSmallest(matrix, k);
        assertThat(ans).isEqualTo(-5);
    }
}
