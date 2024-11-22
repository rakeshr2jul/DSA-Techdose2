package dsa.dp;

public class ClimbingStair {
    // LT :70 Easy https://www.youtube.com/watch?v=Y0lT9Fck7qI

    public static  int climbStair(int n){
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static int climb(int n){
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
          //  System.out.println("Step ==> "+dp[i]);
        }
        return dp[n];
    }
    public static void main(String args[]){

        System.out.println(climbStair(5));
        System.out.println(climb(5));
    }
}
