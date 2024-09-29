class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            
            // Check for overflow before multiplying by 10 and adding the digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow case for negative numbers
            }
            
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}
