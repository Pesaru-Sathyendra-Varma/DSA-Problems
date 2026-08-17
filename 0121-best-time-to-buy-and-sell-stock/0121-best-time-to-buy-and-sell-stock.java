class Solution {
    public int maxProfit(int[] prices) {
        int n= prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(n>prices[i]){
                n = prices[i];
            }
            maxp=Math.max(maxp,prices[i] - n);
            }
        return maxp;

    }
}