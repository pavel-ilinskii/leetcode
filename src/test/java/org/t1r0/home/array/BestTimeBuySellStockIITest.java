package org.t1r0.home.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeBuySellStockIITest {

    private static final BestTimeBuySellStockII subject = new BestTimeBuySellStockII();

    @Test
    void requirement_1() {
        int[] prices = {7, 6, 4, 3, 1};
        int profit = subject.maxProfit(prices);
        assertThat(profit).isEqualTo(0);
    }

    @Test
    void requirement_2() {
        int[] prices = {1, 2, 3, 4, 5};
        int profit = subject.maxProfit(prices);
        assertThat(profit).isEqualTo(4);
    }

    @Test
    void requirement_3() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = subject.maxProfit(prices);
        assertThat(profit).isEqualTo(7);
    }
}
