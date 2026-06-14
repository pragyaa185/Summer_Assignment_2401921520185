class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0){ 
            return 0;
        }
        int cheapPrice=prices[0];
        int bestProfit=0;
        for(int i = 1; i<prices.length;i++) {
            int profitIfSoldToday = prices[i]-cheapPrice;
            if (profitIfSoldToday > bestProfit) {
                bestProfit = profitIfSoldToday;
            }
            if (prices[i]<cheapPrice){
                cheapPrice=prices[i];
            }
        }
        return bestProfit;
    }
}