class Solution {
    public boolean halvesAreAlike(String s) {
       String First = new String(); 
       int Fcount = 0;
       String Second = new String(); 
       int Scount = 0;
       First = s.substring(0,(s.length()/2));
       Second = s.substring((s.length()/2),s.length());
       for(int i = 0 ; i<First.length();i++){
        char Fch = First.charAt(i);
        char Sch = Second.charAt(i);
        if(isVowel(Fch)){
            Fcount +=1;
        }
        if(isVowel(Sch)){
            Scount +=1;
        }
       }
       return Fcount==Scount;
    }
    private boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' ||
           ch == 'O' || ch == 'U';
}
}