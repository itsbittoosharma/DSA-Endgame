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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        PriorityQueue<ListNode> pq=new PriorityQueue<>(Comparator.comparingInt((ListNode n) -> n.val));
        ListNode result=new ListNode(0);
        ListNode dumm=result;
        for(ListNode l:lists)
        {
            if (l != null) {
                pq.add(l);
            }
        }
        while(pq.peek()!=null)
        {
            ListNode temp=pq.poll();
            dumm.next=temp;
            dumm=dumm.next;
            if(temp.next!=null)
            {
                pq.add(temp.next);
            }
        }
        return result.next;
    }
}