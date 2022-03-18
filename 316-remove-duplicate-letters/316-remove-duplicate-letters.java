class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOcc=new int[26];
        Stack<Character> st=new Stack<>();
        boolean[] vis=new boolean[26];
        
        for(int i=s.length()-1;i>=0;i--){
            if(!vis[s.charAt(i)-'a']){
                lastOcc[s.charAt(i)-'a']=i;
                vis[s.charAt(i)-'a']=true;
            }
        }
        
        for(int i=0;i<26;i++)
            vis[i]=false;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(vis[c-'a'])
                continue;
            while(!st.isEmpty() && c<st.peek() && lastOcc[st.peek()-'a']>i){
                char top=st.peek();
                st.pop();
                vis[top-'a']=false;
            }
            vis[c-'a']=true;
            st.add(c);
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char c=st.peek();
            st.pop();
            sb.append(c);
        }
        
        return sb.reverse().toString();
    }
}