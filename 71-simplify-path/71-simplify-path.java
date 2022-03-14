class Solution {
    public String simplifyPath(String path) {
          Stack<String> stack = new Stack<>();
        for(String s : path.split("/+")) {
            if(s.equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            }
            else if(!s.equals(".") && !s.equals("")) stack.push(s);
        }
        return stack.stream().collect(Collectors.joining("/","/",""));
    }
}