import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        int copy = x;
        int lastdigit = 0;
        int sol=0;
        while(x>0){
            lastdigit = x%10;
            sol = (sol *10)+lastdigit ;
            x = x/10;
        }
        if (sol == copy){
            return true ;
        }
        else {
            return false;
        }

    }
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
     int number = scn.nextInt();

        if(isPalindrome(number)){
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }

    }
}