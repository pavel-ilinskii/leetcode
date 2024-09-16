package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementStrStrTest {

    private final ImplementStrStr subject = new ImplementStrStr();

    @Test
    void requirement_1() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int ans = subject.strStr(haystack, needle);
        assertThat(ans).isEqualTo(0);
    }

    @Test
    void requirement_2() {
        String haystack = "leetcode";
        String needle = "leeto";

        int ans = subject.strStr(haystack, needle);
        assertThat(ans).isEqualTo(-1);
    }
}
