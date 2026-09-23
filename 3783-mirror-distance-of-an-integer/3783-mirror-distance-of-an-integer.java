class Solution {
    public int mirrorDistance(int n) {
        int copy = n;
        if(n <10){
            return 0;
        }
        int reverse =0;
        while(n> 0){
        int digit =n%10;
        reverse = reverse*10+digit;
            n=n/10;
        }
        return Math.abs(copy-reverse);
    }
}