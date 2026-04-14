class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int les=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<les)
            {
                les=prices[i];
            }
             res = Math.max(res,prices[i]-les);
        }
        return res;
    }
}
