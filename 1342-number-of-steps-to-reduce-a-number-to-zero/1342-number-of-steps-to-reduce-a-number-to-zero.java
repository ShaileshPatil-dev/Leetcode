class Solution {
    public int numberOfSteps(int num) {
        return Count(num,0);
    }
    static int Count(int n , int c){
        if(n == 0){
            return c;
        }
        if(n%2==0){
         return   Count(n/2,c+1);
        }
        else{
           return Count(n-1,c+1);
        }
    }
}