package validParenthesis;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n ; i ++ ) {
            if (stack.empty() || !arePairs(stack.peek(), s.charAt(i))) {
                stack.add(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    private boolean arePairs(char char1, Character char2) {
        switch (char2) {
            case ')':
                return char1 == '(';
            case ']':
                return char1 == '[';
            case '}':
                return char1 == '{';
            default:
                return false;
        }

    }


}
