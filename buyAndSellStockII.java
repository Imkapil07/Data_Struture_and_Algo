public class buyAndSellStockII {
     public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        for(int i=1; i<n; i++){
          if(prices[i]>prices[i-1]){
              profit+= (prices[i]-prices[i-1]);
          }
        } 
        return profit;
    }  

    public static void main(String[] args) {
        int[] arr={5,2,6,1,4,7,3,6};
        System.out.println(maxProfit(arr));
    }
}
