package longestSubString.java;

import java.util.HashSet;
import java.util.Random;



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




        Random random = new Random();
        int numTests = 10; // Number of random tests to perform

        for (int i = 0; i < numTests; i++) {
            String randomString = generateRandomString(random.nextInt(20) + 1); // Random string length between 1 and 20
            int result = longestSubstringSolution.swLengthOfLongestSubstring(randomString);
            int expected = longestSubstringSolution.bfLengthOfLongestSubstring(randomString); // Use the brute force solution to calculate expected result
            System.out.println("Test case" + i + (result == expected ? ": Passed" : ": Failed"));
        }

    }


    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    // Brute force solution to calculate the expected result
    private static int bruteForceSolution(String s) {
        int n = s.length();
        int longest = 0;
        HashSet<Character> subString = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (subString.contains(s.charAt(j))) {
                    longest = Math.max(subString.size(), longest);
                    subString.clear();
                    break;
                } else {
                    subString.add(s.charAt(j));
                }
            }
        }

        return longest;
    }



}
