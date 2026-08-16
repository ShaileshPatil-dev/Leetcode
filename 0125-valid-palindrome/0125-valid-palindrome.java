class Solution {
    public boolean isPalindrome(String str) {
    int i = 0;
    int j = str.length() - 1;

    while (i < j) {

        if (!Character.isLetterOrDigit(str.charAt(i))) {
            i++;
            continue;
        }

        if (!Character.isLetterOrDigit(str.charAt(j))) {
            j--;
            continue;
        }

        if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
            return false;}
            i++;
            j--;

    }

    return true;
}
    }