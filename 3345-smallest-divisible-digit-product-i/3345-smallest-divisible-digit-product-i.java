class Solution {
    public int smallestNumber(int n, int t) {
        int og = n;
        while(true){
            int product = 1;
            n=og;
            while(n>0){
                int rem = n%10;
                product *= rem;
                n/=10;
            }
            if(product % t ==0){
                break;
            }
            else{
                ++og;
            }
        }
        return og;
    }
}