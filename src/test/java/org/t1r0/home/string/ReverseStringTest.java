package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {

    private static final ReverseString subject = new ReverseString();

    @Test
    void requirement_1() {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        subject.reverseString(s);
        assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    void requirement_2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h' };
        subject.reverseString(s);
        assertThat(s).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
    }
}
