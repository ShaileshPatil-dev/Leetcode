class Solution {
    public int fib(int n) {
        return FS(n);
    }
    static int FS(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return FS(n-1) + FS(n-2);
    }
}