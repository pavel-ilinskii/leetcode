package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KClosestPointsOriginTest {

    public static final KClosestPointsOrigin subject = new KClosestPointsOrigin();

    @Test
    void requirements_1() {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        var ans = subject.kClosest(points, k);
        assertThat(ans).isDeepEqualTo(new int[][]{{-2, 2}});
    }

    @Test
    void requirements_2() {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        var ans = subject.kClosest(points, k);
        assertThat(ans).isDeepEqualTo(new int[][]{{3, 3}, {-2, 4}});
    }
}
