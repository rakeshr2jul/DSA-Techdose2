package dsa.maths;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int C = 1;
        result.add("()");
        for(int i=0;i<n;i++){

            C = C* 2*(2*i+1)/(i+2) ;
            //str =generateParenthesis1(C,result);

           // System.out.println("==="+C);
        }
       //for(String str :result) {
           System.out.println(str);
      // }
       // return (int) C;
        //return result;
    }

    public static void main(String args[]){
       generateParenthesis(3);
    }
}
