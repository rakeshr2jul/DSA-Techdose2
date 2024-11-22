package dsa.maths;

public class PrimeFactors {

    public static void primeFactors(int n) {
        if (n <= 1)
            return;
            for (int i = 2; i * i <= n; i++) {
                //if(isPrime(i)){
                //   int x= i;
                //while (n%x==0){
                while (n % i == 0) {
                    System.out.println(i);
                    //x=x*i;
                    n = n / i;
                }
            }
                if (n > 1)
                    System.out.println(n);


    }



    public static boolean isPrime(int n){

        if(n==1)
            return false;
        for(int i=2;i*i <=n;i++){

            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]){
        primeFactors(12);
    }

}
