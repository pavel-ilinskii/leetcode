package org.t1r0.home.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {

    private final AddBinary subject = new AddBinary();

    @Test
    void requirement_1() {
        String a = "11";
        String b = "1";
        String ans = subject.addBinary(a, b);
        assertThat(ans).isEqualTo("100");
    }

    @Test
    void requirement_2() {
        String a = "1010";
        String b = "1011";
        String ans = subject.addBinary(a, b);
        assertThat(ans).isEqualTo("10101");
    }
}
