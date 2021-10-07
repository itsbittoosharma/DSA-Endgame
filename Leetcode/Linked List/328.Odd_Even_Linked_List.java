class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode odd=head;
        ListNode even=head;
        even = even.next;
        ListNode a=even;
        while(even.next!=null && odd.next!=null){
            odd.next = even.next;
            odd=odd.next;
            if(odd.next!=null){
            even.next = odd.next;
            even=even.next;
            }
        }
        even.next=null;
        odd.next =a;
        return head;
    }
}
