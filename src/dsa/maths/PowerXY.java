package dsa.maths;

public class PowerXY {

    public static double myPow(double x, int n) {
        double res =1;
        if(n==0 )
          return 1;

       while (n != 0){
           if(n % 2 != 0) {
               if (n > 0) {
                   res = res * x;
               } else {
                   res = res * 1 / x;
               }
           }
            n = n / 2;
            x = x * x;
       }
       return  res;
    }

    public static int myPowWithBit(int x, int n){

        int res = 1;
        while (n > 0) {
            if(n % 2 !=0)
                res = res * x;
            x= x*x ;
            n = n/2;

        }
      return  res;
    }
    public static void main(String args[]){
      System.out.println(myPowWithBit(4,5));
    }
}
