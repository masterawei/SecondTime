package StackAndQueue;

import com.sun.corba.se.spi.orbutil.fsm.FSM;

import java.util.Stack;

/**
 * @author away
 * @date 2021-11-25 8:54
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        char[] cs = s.toCharArray();
        char[] stack = new char[s.length()];
        int slow = 0;
        int fast = 1;
        stack[0] = cs[0];
        while (fast < s.length()) {
            if (slow == -1 || stack[slow] != cs[fast]) {
                slow++;
                stack[slow] = cs[fast];
            } else if (stack[slow] == cs[fast]) {
                slow--;
            }
            fast++;
        }
        return new String(stack).substring(0,slow+1);
    }



    public String removeDuplicates2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else if (stack.peek() == c) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {

            sb.append(stack.pop());
        }
        return sb.reverse().toString();


    }
}
