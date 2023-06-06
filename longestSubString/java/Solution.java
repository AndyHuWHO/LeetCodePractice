package longestSubString.java;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
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
}
