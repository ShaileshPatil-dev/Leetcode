class Solution {
    public String restoreString(String s, int[] indices) {
        int size = s.length();
        char[] ans = new char[size];
        for(int i = 0 ; i< s.length() ; i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}