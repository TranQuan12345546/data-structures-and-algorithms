package leetcode;

import java.util.ArrayList;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {
            if (buy > prices[i])
                buy = prices[i];
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    public int maxProfit2(int[] prices) {
        if(prices == null || prices.length==0)
            return 0;
        int profit=0;
        int min = prices[0];
        for(int i : prices){
            min = Math.min(min,i);
            profit=Math.max(profit,i-min);
        }
        return profit;
    }
}
