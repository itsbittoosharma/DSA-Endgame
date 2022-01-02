class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head, slow = head, fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return slow.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy;
    }
}