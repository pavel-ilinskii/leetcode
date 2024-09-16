package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayPartitionITest {

    private static final ArrayPartitionI subject = new ArrayPartitionI();

    @Test
    void requirement_1() {
        int[] nums = {1, 4, 3, 2};
        int ans = subject.arrayPairSum(nums);
        assertThat(ans).isEqualTo(4);
    }

    @Test
    void requirement_2() {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int ans = subject.arrayPairSum(nums);
        assertThat(ans).isEqualTo(9);
    }
}
