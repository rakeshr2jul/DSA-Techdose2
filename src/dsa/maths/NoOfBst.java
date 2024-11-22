package dsa.maths;

public class NoOfBst {

    public static int numTrees(int n) {
         return (int)(binomialCoeff(2*n,n)/n+1);
    }

    public static long binomialCoeff(int n ,int k){
      long res =1;
      if(k > n - k)
          k = n - k;

      for(int i =0;i<k;++i){
          res *= (n-i);
          res /= (i+1);
      }
     return  res;
    }

    public static int numTrees1(int n) {
        long C = 1;
        /**
         *  c0=1, Cn+1= 2(2n+1)/n+2*Cn
         *
         */
        for(int i=0;i<n;i++){
             C = C* 2*(2*i+1)/(i+2) ;
         }
        return (int) C;
    }

    public static void main(String args[]){
     System.out.println(numTrees1(3));
    }
}
