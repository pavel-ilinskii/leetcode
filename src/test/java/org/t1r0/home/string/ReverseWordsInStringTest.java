package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInStringTest {

    private static final ReverseWordsInString subject = new ReverseWordsInString();

    @Test
    void requirement_1() {
        var s = "the sky is blue";
        var ans = subject.reverseWords(s);
        assertThat(ans).isEqualTo("blue is sky the");
    }

    @Test
    void requirement_2() {
        var s = "  hello world  ";
        var ans = subject.reverseWords(s);
        assertThat(ans).isEqualTo("world hello");
    }

    @Test
    void requirement_3() {
        var s = "a good   example";
        var ans = subject.reverseWords(s);
        assertThat(ans).isEqualTo("example good a");
    }
}
