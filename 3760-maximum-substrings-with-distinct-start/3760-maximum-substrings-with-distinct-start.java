class Solution {
    public int maxDistinct(String s) {
        int count =0;
        boolean[] uni = new boolean[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            if (uni[index] == false) {
                uni[index] = true;
                count++;
            }

        }
        return count;
    }
}