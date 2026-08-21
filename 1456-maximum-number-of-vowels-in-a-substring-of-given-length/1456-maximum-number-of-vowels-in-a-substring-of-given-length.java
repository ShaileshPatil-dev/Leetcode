class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove outgoing character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add incoming character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }

        return false;
    }
}