package org.t1r0.home.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortListTest {

    private final static InsertionSortList subject = new InsertionSortList();

    @Test
    void requirement_1() {
        InsertionSortList.ListNode node = InsertionSortList.ListNode.head(4, 2, 1, 3);
        var ans = subject.insertionSortList(node);
        assertList(ans, 1, 2, 3, 4);
    }

    @Test
    void requirement_2() {
        InsertionSortList.ListNode node = InsertionSortList.ListNode.head(-1, 5, 3, 4, 0);
        var ans = subject.insertionSortList(node);
        assertList(ans, -1, 0, 3, 4, 5);
    }

    private void assertList(InsertionSortList.ListNode head, int... expected) {
        int curr = 0;
        while (head != null) {
            assertThat(head.val).isEqualTo(expected[curr++]);
            head = head.next;
        }
    }
}
