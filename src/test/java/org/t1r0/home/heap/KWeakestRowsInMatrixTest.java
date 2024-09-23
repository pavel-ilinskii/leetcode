package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KWeakestRowsInMatrixTest {

    private static final KWeakestRowsInMatrix subject = new KWeakestRowsInMatrix();

    @Test
    void requirement_1() {
        int[][] mat =
                {{1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}};
        int k = 3;
        int[] ans = subject.kWeakestRows(mat, k);
        assertThat(ans).containsExactlyInAnyOrder(2, 0, 3);
    }

    @Test
    void requirement_2() {
        int[][] mat =
                {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k = 2;
        int[] ans = subject.kWeakestRows(mat, k);
        assertThat(ans).containsExactlyInAnyOrder(0, 2);
    }
}
