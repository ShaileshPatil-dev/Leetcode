class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<minbuy){
                minbuy = prices[i];
            }
            if(prices[i]-minbuy>maxprofit){
                maxprofit =prices[i]-minbuy;
            }

        }
        return maxprofit;
    }
}