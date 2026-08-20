class Solution {
    public boolean halvesAreAlike(String s) {

        int Fcount = 0;
        int Scount = 0;

        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + half);

            if (isVowel(ch1)) {
                Fcount++;
            }

            if (isVowel(ch2)) {
                Scount++;
            }
        }

        return Fcount == Scount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}