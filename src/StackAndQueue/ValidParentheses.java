package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author away
 * @date 2021-11-25 8:36
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != c) {
                return false;
            }else stack.pop();
        }
        return stack.isEmpty();
    }


}
