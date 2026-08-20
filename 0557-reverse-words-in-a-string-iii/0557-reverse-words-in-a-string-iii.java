class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i =0 ; i<word.length ;i++){
            for(int j = word[i].length()-1 ; j >= 0; j--){
                char ch = word[i].charAt(j);
                ans.append(ch);
            }
            if (i < word.length - 1) {
    ans.append(" ");
}
        }
        return ans.toString();
    }
}