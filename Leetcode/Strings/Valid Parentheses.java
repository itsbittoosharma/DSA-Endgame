Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                if (c == ')') {
                    if ('(' != stack.pop())
                        return false;
                } else if (c == ']') {
                    if ('[' != stack.pop())
                        return false;
                } else if (c == '}') {
                    if ('{' != stack.pop())
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
