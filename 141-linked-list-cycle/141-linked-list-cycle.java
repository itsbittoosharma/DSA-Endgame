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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode a=head, b=head;
        while(b.next!=null && b.next.next!=null)
        {
            a=a.next;
            b=b.next.next;
            if(a==b) return true;
        }
        return false;
    }
}