class Solution {
    public ListNode middleNode(ListNode head) {
    // BRUTE-FORCE
//         int count=1;
//         for(ListNode temp=head;temp.next!=null;temp=temp.next)
//         {
//             count++;
//             //System.out.println(count);
//         }
//         count=(count/2)+1;
//         ListNode temp=head;
//         for(;count>1;count--,temp=temp.next)
//         {
            
//         }
//         return temp;

    // OPTIMIZED
        ListNode rabit=head; ListNode tortoise=head;
        while(tortoise!=null && tortoise.next!=null)
        {
            rabit=rabit.next;
            tortoise=tortoise.next.next;
        }
        return rabit;
    }
} 
