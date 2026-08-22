class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int count=0;
        String word = words[words.length-1];
        for(int i = 0 ; i<word.length();i++){
            count++;
        }
        return count;
    }
}