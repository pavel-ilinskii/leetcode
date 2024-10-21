package org.t1r0.home.linkedlist;

public class ReverseLinkedListI {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
