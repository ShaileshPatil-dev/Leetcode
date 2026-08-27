class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
                continue;
            }

            if (!isVowel(arr[j])) {
                j--;
                continue;
            }

            swap(i, j, arr);
            i++;
            j--;
        }

        return new String(arr);
    }

    static void swap(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}