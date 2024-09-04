package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindAllNumbersDisappearedTest {

    private final FindAllNumbersDisappeared subject = new FindAllNumbersDisappeared();

    @Test
    void requirement_1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        var ans = subject.findDisappearedNumbers(nums);
        assertThat(ans).containsExactly(5, 6);
    }

    @Test
    void requirement_2() {
        int[] nums = {1, 1};
        var ans = subject.findDisappearedNumbers(nums);
        assertThat(ans).containsExactly(2);
    }
}
