import java.util.Stack;

// @solution-sync:begin
class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c:s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if (c =='{') {
                stack.push('}');
            } else if (c =='['){
                stack.push(']');
            } else {
                if (stack.isEmpty() || c != stack.pop() ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}