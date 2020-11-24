package string;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 */

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='('||i=='{'||i=='[')
            {
                st.push(i);
                
            }
            else if(!st.isEmpty()&&(st.peek()=='('&&i==')'||!st.isEmpty()&&st.peek()=='{'&&i=='}'||!st.isEmpty()&&st.peek()=='['&&i==']'))
                                    st.pop();
            else
            return false;
        }
            return st.isEmpty();
        
        
    }
}
