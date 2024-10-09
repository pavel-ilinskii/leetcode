package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MedianFinderTest {

    @Test
    void requirement_1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        var ans = medianFinder.findMedian();
        assertThat(ans).isEqualTo(1.5);
        medianFinder.addNum(3);
        ans = medianFinder.findMedian();
        assertThat(ans).isEqualTo(2.0);
    }
}
