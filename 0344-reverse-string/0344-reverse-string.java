class Solution {

    public void reverseString(char[] s) {
        Rev(s, 0, s.length - 1);
    }

    static void Rev(char[] s, int index1, int index2) {

        if (index1 >= index2) {
            return;
        }

        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;

        Rev(s, index1 + 1, index2 - 1);
    }
}