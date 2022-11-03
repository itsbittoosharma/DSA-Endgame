class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hm=new HashMap<>();
        int ans=0;
        for(String i:words)
        {
            if(hm.containsKey(i)&&hm.get(i)>0)
            {
                System.out.print(i);
                ans+=4;
                hm.put(i,hm.get(i)-1);
            }
            else
            {
                String newstr=i.substring(1)+i.substring(0,1);
                hm.put(newstr,hm.getOrDefault(newstr,0)+1);
            }
        }
        for(Map.Entry<String,Integer> i : hm.entrySet())
        {
            if(i.getKey().charAt(0)==i.getKey().charAt(1) && i.getValue()>0) return ans+=2;
        }
        return ans;
    }
}