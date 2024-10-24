package org.t1r0.home.queuestack;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) return false;
                char cur = stack.pop();
                if (chars[i] == ')' && cur != '(') return false;
                if (chars[i] == '}' && cur != '{') return false;
                if (chars[i] == ']' && cur != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
