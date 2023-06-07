package longestSubString.java;

public class Main {
    public static void main(String[] args) {
        Solution longestSubstringSolution = new Solution();

        // Test case 1: String with no repeating characters
        String s1 = "abcde";
        int expected1 = 5;
        int result1 = longestSubstringSolution.bfLengthOfLongestSubstring(s1);
        System.out.println("Test case 1: " + (result1 == expected1 ? "Passed" : "Failed"));

        // Test case 2: String with repeating characters
        String s2 = "aabccdef";
        int expected2 = 4;
        int result2 = longestSubstringSolution.swLengthOfLongestSubstring(s2);
        System.out.println("Test case 2: " + (result2 == expected2 ? "Passed" : "Failed"));

        // Test case 3: Empty string
        String s3 = "";
        int expected3 = 0;
        int result3 = longestSubstringSolution.swLengthOfLongestSubstring(s3);
        System.out.println("Test case 3: " + (result3 == expected3 ? "Passed" : "Failed"));

        // Test case 4: String with all repeating characters
        String s4 = "aaaaa";
        int expected4 = 1;
        int result4 = longestSubstringSolution.bfLengthOfLongestSubstring(s4);
        System.out.println("Test case 4: " + (result4 == expected4 ? "Passed" : "Failed"));

        // Test case 5: String with a single character
        String s5 = "x";
        int expected5 = 1;
        int result5 = longestSubstringSolution.swLengthOfLongestSubstring(s5);
        System.out.println("Test case 5: " + (result5 == expected5 ? "Passed" : "Failed"));
    }
}
