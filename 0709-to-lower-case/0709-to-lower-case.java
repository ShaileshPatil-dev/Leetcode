class Solution {
    public String toLowerCase(String s) {
        String ans = new String();
        // String ans = s.toLowerCase();
        for(int i = 0 ; i< s.length() ;i++){
            int ch =(int) s.charAt(i);
            if(ch>=65 && ch <=90){
                ch += 32;
                ans += (char)ch;
            }
            else{
                ans += (char)ch;
            }
        }
        return ans;
    }
}