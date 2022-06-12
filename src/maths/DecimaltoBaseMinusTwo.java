package maths;

public class DecimaltoBaseMinusTwo {

    //Given an integer n, return a binary string representing its representation in base -2.

    public static String baseNeg2(int n) {
       if(n <=0)
           return "0";

       String str ="";
       while (n!=0){
           if(Math.abs(n%2)==1){
               str+="1";
               n = (n-1)/(-2);
           }else{
              str+="0";
              n = n/(-2);
           }
       }
       StringBuilder st = new StringBuilder(str);

       return st.reverse().toString();
    }

    public static String baseNeg2V(int n) {
        if(n <=0)
            return "0";

        String ans ="";
        while (n!=0){
            int rem = n % (-2);
            n = n/ (-2);
            if(rem < 0){
                rem = rem - (-2);
                n=n+1;
            }
            ans =rem+ans;
        }
        return ans;
    }


    public static void main(String args[]){

       System.out.println(baseNeg2V(3));
    }
}
