package bitmanipulations;

public class HummingDistance {

    public static int hammingDistance(int x, int y) {

        int num = x ^ y;
        int setBit =0;
        while(num > 0){

            setBit+=num & 1;
            num >>=1;

        }

        return setBit;

    }

    public static void main(String args[]){
        int a =1, b=4;
        System.out.println(hammingDistance(a,b));
    }
}
