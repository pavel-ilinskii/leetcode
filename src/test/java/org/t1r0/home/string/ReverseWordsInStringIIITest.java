package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInStringIIITest {

    private static final ReverseWordsInStringIII subject = new ReverseWordsInStringIII();

    @Test
    void requirement_1() {
        var s = "Let's take LeetCode contest";
        var ans = subject.reverseWords(s);
        assertThat(ans).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    void requirement_2() {
        var s = "Mr Ding";
        var ans = subject.reverseWords(s);
        assertThat(ans).isEqualTo("rM gniD");
    }
}
