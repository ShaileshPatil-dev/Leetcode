class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int count =0;
        while((n&1)==0){
            count++;
            n>>>=1;
        }
        if(n!=1){
            return false;
        }
            return count % 2 ==0;
    }
}