/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast.next==null || fast.next.next==null) return null;
        fast=head;
        while(slow!=fast)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}