package org.t1r0.home.linkedlist;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
