class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // for(int price : prices)
        // {
        //     if(price < minPrice)
        //         minPrice = price;
        //     else if(price - minPrice > maxProfit)
        //         maxProfit = price - minPrice;
        // }    

        //Optimal solution loop
        for (int p : prices) 
        {
            if (p < minPrice) 
            {
                minPrice = p;                 // best buy seen so far
            } else 
            {
                int profit = p - minPrice;    // sell today
                if (profit > maxProfit) maxProfit = profit;
            }
        }      

        return maxProfit;
    }
}