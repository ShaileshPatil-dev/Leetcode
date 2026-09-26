class Solution {
    public int myAtoi(String s) {

        // Remove leading whitespace
        s = s.trim();

        // Empty string
        if (s.length() == 0) {
            return 0;
        }

        // Sign
        int i = 0;
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } 
        else if (s.charAt(0) == '+') {
            i++;
        }

        // Conversion
        int value = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            // Stop at first non-digit
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // Check overflow BEFORE value = value * 10 + digit
            if (value > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            value = value * 10 + digit;

            i++;
        }

        return value * sign;
    }
}