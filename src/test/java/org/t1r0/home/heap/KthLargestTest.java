package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestTest {

    @Test
    void requirement_1() {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        int[] vals = {3, 5, 10, 9, 4};

        int[] ans = kth(k, nums, vals);

        assertThat(ans).containsExactly(4, 5, 5, 8, 8);
    }

    @Test
    void requirement_2() {
        int k = 4;
        int[] nums = {7, 7, 7, 7, 8, 3};
        int[] vals = {2, 10, 9, 9};

        int[] ans = kth(k, nums, vals);

        assertThat(ans).containsExactly(7, 7, 7, 8);
    }

    private int[] kth(int k, int[] nums, int[] vals) {
        KthLargest kth = new KthLargest(k, nums);

        int[] ans = new int[vals.length];

        for (int i = 0; i < vals.length; i++) {
            ans[i] = kth.add(vals[i]);
        }

        return ans;
    }
}
