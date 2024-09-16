package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private static final LongestCommonPrefix subject = new LongestCommonPrefix();

    @Test
    void requirement_1() {
        String[] strs = {"flower", "flow", "flight"};
        var ans = subject.longestCommonPrefix(strs);
        assertThat(ans).isEqualTo("fl");
    }

    @Test
    void requirement_2() {
        String[] strs = {"dog", "racecar", "car"};
        var ans = subject.longestCommonPrefix(strs);
        assertThat(ans).isEqualTo("");
    }

    @Test
    void requirement_3() {
        String[] strs = {};
        var ans = subject.longestCommonPrefix(strs);
        assertThat(ans).isEqualTo("");
    }

    @Test
    void requirement_4() {
        String[] strs = {""};
        var ans = subject.longestCommonPrefix(strs);
        assertThat(ans).isEqualTo("");
    }

    @Test
    void requirement_5() {
        String[] strs = {"ab", "a"};
        var ans = subject.longestCommonPrefix(strs);
        assertThat(ans).isEqualTo("a");
    }
}
