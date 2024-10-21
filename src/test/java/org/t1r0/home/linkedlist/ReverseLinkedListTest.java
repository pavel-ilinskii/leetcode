package org.t1r0.home.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

    private static final ReverseLinkedListI subject = new ReverseLinkedListI();

    @Test
    void requirement_1() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ListNode reverse = subject.reverseList(ln1);
        assertThat(reverse).isEqualTo(ln5);
        assertThat(reverse.next).isEqualTo(ln4);
        assertThat(reverse.next.next).isEqualTo(ln3);
        assertThat(reverse.next.next.next).isEqualTo(ln2);
        assertThat(reverse.next.next.next.next).isEqualTo(ln1);
    }
}
