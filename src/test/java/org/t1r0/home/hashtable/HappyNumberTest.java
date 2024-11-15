package org.t1r0.home.hashtable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyNumberTest {

    private static final HappyNumber subject = new HappyNumber();

    @Test
    void requirements_1() {
        int n = 19;
        boolean ans = subject.isHappy(n);
        assertThat(ans).isTrue();
    }

    @Test
    void requirements_2() {
        int n = 2;
        boolean ans = subject.isHappy(n);
        assertThat(ans).isFalse();
    }

    @Test
    void requirements_3() {
        int n = 3;
        boolean ans = subject.isHappy(n);
        assertThat(ans).isFalse();
    }

    @Test
    void requirements_4() {
        int n = 66;
        boolean ans = subject.isHappy(n);
        assertThat(ans).isFalse();
    }
}
