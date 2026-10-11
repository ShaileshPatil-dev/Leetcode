class Solution {
    public String reversePrefix(String word, char ch) {

        char[] arr = word.toCharArray();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return word;
        }

        int start = 0;
        int end = index;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}
