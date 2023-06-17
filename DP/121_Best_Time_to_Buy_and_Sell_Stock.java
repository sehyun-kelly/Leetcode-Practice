/** My Solution - 93.87%, 38.64% */

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int stock = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > stock){
                if(prices[i] - stock > max) max = prices[i] - stock;
            }else{
                stock = prices[i];
            }
        }

        return max;
    }
}
