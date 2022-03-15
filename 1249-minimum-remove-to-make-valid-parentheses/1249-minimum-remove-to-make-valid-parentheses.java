class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i ){
            if(s.charAt(i) == '(') {
                sb.append('(');
                count++;
            }
            else if(s.charAt(i) == ')'){
                --count;
                if(count < 0){
                    count = 0;
                }
                else{
                    sb.append(')');
                }
            }
            else{sb.append(s.charAt(i));}
        }
        while(count > 0 ){
            sb.deleteCharAt(sb.lastIndexOf("("));
            --count;
            }
        return sb.toString();
    }
}