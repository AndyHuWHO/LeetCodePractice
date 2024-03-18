package validParenthesis.java;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with valid parentheses
        System.out.println(solution.isValid(""));  // true (empty string)
        System.out.println(solution.isValid("()"));  // true
        System.out.println(solution.isValid("()[]{}"));  // true
        System.out.println(solution.isValid("{[()]}"));  // true
        System.out.println(solution.isValid("(([]){})"));  // true
        System.out.println();

        // Test cases with invalid parentheses
        System.out.println(solution.isValid("("));  // false
        System.out.println(solution.isValid(")"));  // false
        System.out.println(solution.isValid("()[]{}("));  // false
        System.out.println(solution.isValid("({[()]}}"));  // false
        System.out.println(solution.isValid(")[]("));  // false
    }
}
