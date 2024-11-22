package dsa.bits;

public class RangeBitwiseAnd {


    public static int rangeBitwiseAnd(int left, int right) {
        int count=0;
        while(left!=right){
             left >>= 1;
             right >>= 1;
            count++;
        }

        return left <<=count;
    }

    public static boolean isPowerOfTwo(int n) {
       if(n==0)
           return false;

       if((n & n-1) == 0)
           return true;

       return false;
    }


    public static int[] countBits(int n) {
        int bits[] = new int[n+1];

        for(int i=0;i<=n;i++) {
            System.out.println("hi=="+Integer.highestOneBit(i));
            System.out.println("lo=="+Integer.lowestOneBit(i));
            bits[i] = Integer.bitCount(i);
        }
        return bits;
    }

    public static void main(String args[]){
        //4,1,2,1,2
        int x = 0, y=0;
        System.out.println(rangeBitwiseAnd(5,7));
    }
}
