class Solution {
    public String removeDuplicates(String ss) {
        Stack<Character> s=new Stack<Character>();
        for(char a:ss.toCharArray())
        {
            if(!s.isEmpty()&&s.peek()==a)
                s.pop();
            else s.push(a);
        }
        String ans="";
        while(!s.isEmpty())
        {
            ans=s.pop()+ans;
        }
        return ans;
    }
}