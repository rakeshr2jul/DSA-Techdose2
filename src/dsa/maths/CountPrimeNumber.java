package dsa.maths;

public class CountPrimeNumber {

    //Given an integer n, return the number of prime numbers that are strictly less than n.

    public static int countPrimes(int n) {
        boolean primecount[] = new boolean[n+1];
         int count=0;
         for(int p =2;p<primecount.length;p++){
             primecount[p] = true;
         }
          for(int i =2 ;i<Math.sqrt(n);i++){

              if(primecount[i] ==true) {
                  for (int j = i*i ; j <= n; j=j+i) {
                      primecount[j] = false;
                  }
              }
          }

          for(int i=0;i<n;i++){
              if(primecount[i])
                  count++;
          }
            return count;
    }


    public static void main(String args[]){
        System.out.println(countPrimes(2));
    }

}
