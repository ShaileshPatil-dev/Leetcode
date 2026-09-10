class Solution {
    public double myPow(double x, int n) {

        double ans = 1;
        double base = x;

        long pow = n;

        if (pow < 0) {
            pow = -pow;
        }

        while (pow > 0) {

            if ((pow & 1) == 1) {
                ans *= base;
            }

            base *= base;
            pow = pow >> 1;
        }

        if (n < 0) {
            return 1 / ans;
        }

        return ans;
    }
}
