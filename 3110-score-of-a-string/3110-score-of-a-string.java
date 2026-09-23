class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i < s.length()-1; i++){
            int ch1 = s.charAt(i);
            int ch2 = s.charAt(i+1);
            score+=Math.abs(ch1-ch2);
        }
        return score;
    }
}