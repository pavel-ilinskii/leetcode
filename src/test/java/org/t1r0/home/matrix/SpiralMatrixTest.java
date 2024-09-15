package org.t1r0.home.matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SpiralMatrixTest {

    private final SpiralMatrix subject = new SpiralMatrix();

    @Test
    void requirement_1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = subject.spiralOrder(mat);
        assertThat(ans).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }

    @Test
    void requirement_2() {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> ans = subject.spiralOrder(mat);
        assertThat(ans).containsExactly(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    }
}
