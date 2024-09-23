package org.t1r0.home.sorting;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode ans = new ListNode();
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = ans;
            while (prev.next != null && prev.next.val <= curr.val) {
                prev = prev.next;
            }
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        return ans.next;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode head(int... vals) {
            ListNode head = null;
            ListNode next = null;
            for (int i = vals.length - 1; i >= 0; i--) {
                head = new ListNode();
                head.val = vals[i];
                head.next = next;
                next = head;
            }
            return head;
        }
    }
}

