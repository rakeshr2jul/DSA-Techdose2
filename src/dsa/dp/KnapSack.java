package dsa.dp;

public class KnapSack {


   private static int kp(int wt[],int profit[],int w,int n){

     //  int mem [] [] = new int[w][n];
       if(w==0 || n==0)
           return 0;

       int result =0;
       if(wt[n] > w)
           result= kp(wt,profit,w,n-1);
       else
           result= Math.max(kp(wt,profit,w,n-1),profit[n]+kp(wt,profit,w-wt[n],n-1));
       return result;
   }

   private static int kpiterative(int wt[],int profit[],int w,int n){

       int dp[][] = new int[n+1][w+1];
       for(int i=0;i<=n;i++){
           for(int j =0;j<=w;j++){
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }else if(wt[i-1]>j) {
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], profit[i - 1] + dp[i - 1][w - wt[i - 1]]);
                }
          }
       }
     return 0;
   }


    public static void main(String args[]){

        int wt [] ={3,2,4};
        int profit [] ={6,8,7};
        int weight = 8;

        System.out.println("Maximum profit :"+kp(wt,profit,weight, wt.length-1));
        System.out.println(("Max ::"+kpiterative(wt,profit,weight,wt.length)));

    }
}
