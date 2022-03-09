/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans=new ListNode(0);
        ListNode dumm=ans;
        while(head!=null)
        {
            int val=head.val;
            if(head.next!=null && head.next.val==val)
            {
                do{
                    head=head.next;
                }
                while(head!=null && head.val==val);
                continue;
            }
            dumm.next=head;
            dumm=dumm.next;
            if(head!=null)
            {
                head=head.next;
            }
        }
        dumm.next=null;
        return ans.next;
    }
}