class Solution {
    public int maxProfit(int[] prices) {
        int index=0;
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[index]){
                sum+=prices[i]-prices[index++];

            }else if(prices[i]<prices[index]){
                index++;
            }else{
                index++;
            }


        }
        return sum;
    }
}
