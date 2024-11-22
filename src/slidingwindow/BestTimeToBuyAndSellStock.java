package slidingwindow;

public class BestTimeToBuyAndSellStock {
    //LC 121 easy https://www.youtube.com/watch?v=34WE6kwq49U&t=413s

    public static int maxProfit(int[] prices) {
      int l=0;
      int r=1;
      int maxProfit =0;

      while (r < prices.length){
          if(prices[l] < prices[r]){
              int profit = prices[r] - prices[l];
              maxProfit = Math.max(maxProfit, profit);
          }else {
            l=r;
          }
          r++;
      }
     return maxProfit;
    }

    public static int maxProfit2(int[] prices){
        int minSoFax = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int price : prices){
            minSoFax = Math.min(minSoFax,price);
            maxProfit = Math.max(price-minSoFax,maxProfit);
        }

        return maxProfit;
    }
    public static void main(String args[]){
            int nums[] ={7,1,5,3,6,4};
            System.out.println(maxProfit(nums));

            System.out.println(maxProfit2(nums));

    }
}
