package org.t1r0.home.matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PascalTriangleTest {

    private final PascalTriangle subject = new PascalTriangle();

    @Test
    void requirement_1() {
        int numRows = 5;
        var ans = subject.generate(numRows);
        assertThat(ans.get(0)).containsExactly(1);
        assertThat(ans.get(1)).containsExactly(1, 1);
        assertThat(ans.get(2)).containsExactly(1, 2, 1);
        assertThat(ans.get(3)).containsExactly(1, 3, 3, 1);
        assertThat(ans.get(4)).containsExactly(1, 4, 6, 4, 1);
    }

    @Test
    void requirement_2() {
        int numRows = 1;
        var ans = subject.generate(numRows);
        assertThat(ans.get(0)).containsExactly(1);
    }
}
