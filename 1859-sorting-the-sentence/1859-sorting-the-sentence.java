class Solution {
    public String sortSentence(String s) {
        String[] words= s.split(" ");
        String[] ans = new String[words.length];
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i<words.length ; i++){
            String word = words[i];
            char ch = word.charAt(word.length()- 1);
            int pos= ch - '0';
            ans[pos-1] =word.substring(0,word.length()-1);
        }
        for(int j = 0 ; j < ans.length ; j++){
            builder.append(ans[j]);
            if(j<ans.length-1){
                    builder.append(" ");
            }
        }
        return builder.toString();
    }
}