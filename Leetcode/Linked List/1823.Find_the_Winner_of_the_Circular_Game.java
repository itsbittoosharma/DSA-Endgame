
// Question Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 1;i<=n;i++)
            q1.add(i);
        int c = 0;
        while(q1.size()!=1 && q2.size()!=1){
            c=0;
            while(!q1.isEmpty()){
                c++;
                if(c<k)
                    q1.add(q1.remove());
                else if(c==k) q1.remove();
                else
                q2.add(q1.remove());
                
            }
            if(c!=0) continue;
            while(!q2.isEmpty()){
                c++;
                 if(c<k)
                    q2.add(q2.remove());
                else if(c==k)
                    q2.remove();
                else
                q1.add(q2.remove());
            }
        }
        return q1.isEmpty() ? q2.peek() : q1.peek();
    }
}
