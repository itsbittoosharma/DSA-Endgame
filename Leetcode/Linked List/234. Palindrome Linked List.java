class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        slow = slow.next;

        ListNode dummy = head;
        while (slow != null) {
            if (dummy.val != slow.val)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }

    ListNode reverseList(ListNode dummy) {
        ListNode prev = null, next = null;
        while (dummy != null) {
            next = dummy.next;
            dummy.next = prev;
            prev = dummy;
            dummy = next;
        }
        return prev;
    }
}
