package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceRightGreatestTest {

    private final ReplaceRightGreatest subject = new ReplaceRightGreatest();

    @Test
    void requirements_1() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        int[] ans = subject.replaceElements(arr);
        assertThat(ans).containsExactly(expected);
    }

    @Test
    void requirements_2() {
        int[] arr = {400};
        int[] expected = {-1};
        int[] ans = subject.replaceElements(arr);
        assertThat(ans).containsExactly(expected);
    }
}
