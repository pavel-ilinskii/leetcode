package org.t1r0.home.matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PascalTriangleIITest {

    private static final PascalTriangleII subject = new PascalTriangleII();

    @Test
    void requirement_1() {
        int rowNum = 3;
        var ans = subject.getRow(rowNum);
        assertThat(ans).containsExactly(1, 3, 3, 1);
    }

    @Test
    void requirement_2() {
        int rowNum = 0;
        var ans = subject.getRow(rowNum);
        assertThat(ans).containsExactly(1);
    }

    @Test
    void requirement_3() {
        int rowNum = 1;
        var ans = subject.getRow(rowNum);
        assertThat(ans).containsExactly(1, 1);
    }
}
