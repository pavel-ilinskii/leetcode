package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindEvenNumbersTest {

    private FindEvenNumbers subject = new FindEvenNumbers();

    @Test
    void requirements() {
        int[] nums = {12, 345, 2, 6, 7896};
        int ans = subject.findNumbers(nums);
        assertThat(ans).isEqualTo(2);
    }
}
