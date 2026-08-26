class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        double totalPrice = 0;

        int j = discounts.length - 1;

        for (int i = prices.length - 1; i >= 0; i--) {

            double dis = 0;

            if (j >= 0) {
                dis = prices[i] * discounts[j] / 100.0;
                j--;
            }

            totalPrice += prices[i] - dis;
        }

        return totalPrice;
    }
}