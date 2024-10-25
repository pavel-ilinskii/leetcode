package org.t1r0.home.queuestack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecodeStringTest {

    private static final DecodeString subject = new DecodeString();

    @Test
    void requirement_1() {
        String s = "3[a]2[bc]";
        String ans = subject.decodeString(s);
        assertThat(ans).isEqualTo("aaabcbc");
    }

    @Test
    void requirement_2() {
        String s = "3[a2[c]]";
        String ans = subject.decodeString(s);
        assertThat(ans).isEqualTo("accaccacc");
    }

    @Test
    void requirement_3() {
        String s = "2[abc]3[cd]ef";
        String ans = subject.decodeString(s);
        assertThat(ans).isEqualTo("abcabccdcdcdef");
    }
}
