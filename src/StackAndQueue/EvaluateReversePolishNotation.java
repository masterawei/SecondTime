package StackAndQueue;

import java.util.Stack;

/**
 * @author away
 * @date 2021-11-25 10:05
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1 =0;
        int num2 = 0;
        for (String token : tokens) {
            if (token.equals("/")) {
                 num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2/num1);
            } else if (token.equals("*")) {
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num1*num2);
            } else if (token.equals("+")) {
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num1+num2);
            } else if (token.equals("-")) {
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 - num1);
            }else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}
