class Solution {
    public String interpret(String command) {
        StringBuilder string= new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                string.append("G");
            }
            else if(command.charAt(i) =='(' && command.charAt(i+1)==')'){
                string.append("o");
                i++;
            }
            else{
                string.append("al");
                i+=3;
            }
        }
        return string.toString();
    }
}