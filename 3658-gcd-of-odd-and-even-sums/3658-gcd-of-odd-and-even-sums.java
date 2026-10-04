class Solution {

    public int gcdOfOddEvenSums(int n) {

        int odd = sumOdd(n);
        int even = sumEven(n);

        return Math.abs(odd - even);
    }

    static int sumOdd(int n) {

        int ans = 0;
        int odd = 1;

        while (n > 0) {
            ans += odd;
            odd += 2;
            n--;
        }

        return ans;
    }

    static int sumEven(int n) {

        int ans = 0;
        int even = 2;

        while (n > 0) {
            ans += even;
            even += 2;
            n--;
        }

        return ans;
    }
}