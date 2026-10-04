class Solution {
    public String reversePrefix(String s, int k) {
      StringBuilder builder = new StringBuilder();

      for(int i = k-1 ; i >=0;i--){
        builder.append(s.charAt(i));
      }
      for(int i = k ; i< s.length();i++){
        builder.append(s.charAt(i));
      }
      return builder.toString();
    }
}