class Solution {
    public int maxProfit(int[] prices) {
        int minday=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            minday=Math.min(minday,prices[i]);
            if(minday<prices[i])
            max_profit=Math.max(max_profit,prices[i]-minday);
        }
        return max_profit;
    }
}