package 14.LongestPrefix.java;

public class solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
          return "";
        }
      
        int n = strs.length;
        int longest = 0;
      
        while (longest < strs[0].length()) {
            char nextChar = strs[0].charAt(longest);
          
            for (int i = 1; i < n; i++) {
                if (longest >= strs[i].length() || strs[i].charAt(longest) != nextChar) {
                    return strs[0].substring(0, longest);
                }
            }
          
            longest++;
        }
        return strs[0].substring(0, longest);
  }
    
}

// initiate k =0
// for i = 0 to strs.length,  s = string[i].charAt(k)
