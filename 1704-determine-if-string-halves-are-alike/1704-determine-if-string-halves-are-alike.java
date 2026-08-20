class Solution {
    public boolean halvesAreAlike(String s) {

        int count = 0;
        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i + half))) {
                count--;
            }
        }

        return count == 0;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}