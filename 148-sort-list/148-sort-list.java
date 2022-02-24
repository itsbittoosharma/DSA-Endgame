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
    ListNode newHead=new ListNode(0);
    ListNode aa=newHead;
    public ListNode sortList(ListNode head) {
        int t=0;
        ListNode dumm=head;
        while(dumm!=null)
        {
            dumm=dumm.next;
            t+=1;
        }
        ListNode[] arr=new ListNode[t];
        dumm=head;
        int i=0;
        while(dumm!=null)
        {
            arr[i++]=dumm;
            dumm=dumm.next;
        }
        Arrays.sort(arr,(a,b)->a.val-b.val);
        
        for(ListNode a:arr)
        {
            newHead.next=a;
            newHead=newHead.next;
        }
        newHead.next=null;
        return aa.next;
    }
}