class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode dummy = head;
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            dummy = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        dummy.next = slow.next;
        return head;
    }

}