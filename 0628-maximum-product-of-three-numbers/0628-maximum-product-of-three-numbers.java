class Solution {
    public int maximumProduct(int[] nums) {

        int L1 = Integer.MIN_VALUE;
        int L2 = Integer.MIN_VALUE;
        int L3 = Integer.MIN_VALUE;

        int S1 = Integer.MAX_VALUE;
        int S2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Find 3 largest numbers
            if (num > L1) {
                L3 = L2;
                L2 = L1;
                L1 = num;
            } 
            else if (num > L2) {
                L3 = L2;
                L2 = num;
            } 
            else if (num > L3) {
                L3 = num;
            }

            // Find 2 smallest numbers
            if (num < S1) {
                S2 = S1;
                S1 = num;
            } 
            else if (num < S2) {
                S2 = num;
            }
        }

        int product1 = L1 * L2 * L3;
        int product2 = L1 * S1 * S2;

        return Math.max(product1, product2);
    }
}