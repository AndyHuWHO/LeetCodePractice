package longestSubString.java;

import java.util.HashSet;

public class Solution {
    public int bfLengthOfLongestSubstring(String s) {
        int n = s.length();
        int beginning = 0;
        int longest = 0;
        char[] charArr = s.toCharArray();
        HashSet<Character> subString = new HashSet<>();
        while (n-beginning > longest) {
            for (int i=beginning; i<n; i++) {
                if (!subString.contains(charArr[i])) {
                    subString.add(charArr[i]);
                } else {
                    longest = Math.max(subString.size(), longest);
                    beginning++;
                    subString.clear();
                    break;
                }

            }
        }
        return longest;
    }

    public int swLengthOfLongestSubstring (String s) {
        int longest = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        HashSet<Character> subString = new HashSet<>();
        while (right < n) {
            if (!subString.contains(s.charAt(right))) {
                subString.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1);
                right ++;
            } else {
                subString.remove(s.charAt(left));
                left ++;
            }
        }
        return longest;
    }
}
