package org.t1r0.home.matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiagonalTraverseTest {

    private final DiagonalTraverse subject = new DiagonalTraverse();

    @Test
    void requirement_1() {
        int[][] mat = {{1, 2}, {3, 4}};
        int[] ans = subject.findDiagonalOrder(mat);
        assertThat(ans).containsExactly(1, 2, 3, 4);
    }

    @Test
    void requirement_2() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ans = subject.findDiagonalOrder(mat);
        assertThat(ans).containsExactly(1, 2, 4, 7, 5, 3, 6, 8, 9);
    }
}
