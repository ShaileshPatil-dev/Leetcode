class Solution {
    public boolean checkDivisibility(int n) {
       int sum = findSum(n);
       int product = findProduct(n);
       int ans = sum + product ;
       return n%ans==0;
    }
    static int findSum(int n){
        int sum =0;
        while(n > 0){
            int rem = n %10;
            sum += rem;
            n/=10;
        }
        return sum;
    }

    static int findProduct(int n){
        int product = 1;
        while(n>0){
            int rem = n %10;
            product *= rem;
            n/=10;
        }
        return product;
    }
}