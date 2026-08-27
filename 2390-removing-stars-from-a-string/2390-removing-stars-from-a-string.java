class Solution {
    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                builder.append(ch);
            }
            else{
               builder.deleteCharAt(builder.length()-1); 
            }
        }
        return builder.toString();
    }
}