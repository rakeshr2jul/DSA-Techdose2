package slidingwindow;

public class BestTimeToBuyAndSellStockII {
    // LT : 122 medium
    public static int maxProfit1(int[] a){
        int profit =0;
        for(int i=1;i<a.length;i++){

            if(a[i] > a [i-1]){
                profit += (a[i] - a[i-1]);
            }
        }

      return profit;
    }


    public static void main(String args[]){
       int prices[] = {1,7,1,5,3,6,4};

       System.out.println(maxProfit1(prices));
    }

}
