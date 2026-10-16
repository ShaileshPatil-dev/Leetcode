class Solution {
    public int fib(int n) {
        return FS(n);
    }
    static int FS(int n){
      if (n <= 1) {
            return n;
        }
        return FS(n-1) + FS(n-2);
    }
}