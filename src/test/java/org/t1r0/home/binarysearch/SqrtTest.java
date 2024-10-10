package org.t1r0.home.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SqrtTest {

    public static final Sqrt subject = new Sqrt();

    @Test
    void requirement_1() {
        int x = 4;
        int ans = subject.mySqrt(x);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_2() {
        int x = 8;
        int ans = subject.mySqrt(x);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirement_3() {
        int x = 1;
        int ans = subject.mySqrt(x);
        assertThat(ans).isEqualTo(1);
    }

    @Test
    void requirement_4() {
        int x = 6;
        int ans = subject.mySqrt(x);
        assertThat(ans).isEqualTo(2);
    }
}
