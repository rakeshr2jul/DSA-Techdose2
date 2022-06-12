package maths;

public class DecimalToBase7 {

    public static String convertToBase7(int num) {

      String ans ="";
      String prefix="";
       if(num==0)
           ans ="0";

       if(num < 0){
           prefix ="-";
           num *=(-1);
       }

         while(num !=0){
            int rem = num % 7;
             ans =rem+ans;
             num = num/7;
         }
         return prefix+ans;
    }

    public static void main(String args[]){
      System.out.println(convertToBase7(-7));
    }
}
