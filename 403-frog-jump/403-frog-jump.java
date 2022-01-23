class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Pair<Integer,Integer>,Integer> dp=new HashMap();
        return check(stones,0,0,0,dp);
    }
    public boolean check(int[] stones, int stone,int ind,int step,HashMap<Pair<Integer,Integer>,Integer> dp)
    {
        if(stone==stones[stones.length-1])
            return true;
        if(dp.containsKey(new Pair<Integer,Integer>(stone,step))) return false;
       
        for(int i=ind+1;i<stones.length;i++)
        {
            if(step-1>0 && stones[i]==stones[ind]+step-1)
            {
                if(check(stones,stones[i],i,step-1,dp)) return true;
                else dp.put(new Pair<Integer,Integer>(stones[i],step-1),0);
                
            }
            if(step>0 && stones[i]==stones[ind]+step)
            {
                if(check(stones,stones[i],i,step,dp)) return true;
                
            }
            if(stones[i]==stones[ind]+step+1)
            {
                if(check(stones,stones[i],i,step+1,dp)) return true;
                dp.put(new Pair<Integer,Integer>(stones[i],step+1),0);
            }
            else if(stones[i]>stones[ind]+step+1)
                break;
        }
        
        // dp.put(new Pair<Integer,Integer>(stone,step+1),0);
        dp.put(new Pair<Integer,Integer>(stone,step),0);
        // dp.put(new Pair<Integer,Integer>(stone,step-1),0);
        
        return false;
    }
}