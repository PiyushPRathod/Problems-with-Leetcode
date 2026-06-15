class Solution {
    public int maxProfit(int[] prices) 
    {
        // 1st try
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for(int p = 0; p < prices.length; p++)
        {
            if(prices[p] < buy)
            {
                buy = prices[p];
            }

            if(prices[p] - buy > profit)
                profit = prices[p] - buy;
        }
        
        return profit;
    }
}