package 9. Palindrome Number.java;

public class solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int n = s.length();

        for (int i= 0, j= n-1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public boolean NSisPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;

        for (int i = 0,n = (int) Math.log10(x); i <= n; i++) {
            int multipler = (int) Math.pow(10, n - i);
            int divisor = (int) Math.pow(10, i);
            int digit = (x / divisor) % 10;
            reverse += digit * multipler;
        }

        return reverse == x;
        
    }


    public boolean YoutubeisPalindrome(int x) {
        if (x < 0) {
                return false;
        }

             int reverse = 0, copy =x;

            while (copy>0) {
        int digit = copy % 10;
        reverse = reverse * 10 + digit;
        copy /= 10;
       }
        return reverse == x;
    }
}
