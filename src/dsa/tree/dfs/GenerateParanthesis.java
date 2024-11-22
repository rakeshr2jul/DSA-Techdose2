package dsa.tree.dfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
      //Leetcode 22 medium https://www.youtube.com/watch?v=s9fokUqJ76A
    static List<String> generate(int n){
       List<String> result = new ArrayList<>();
        generate(result,0,0,n,"");
     //  findAll("(",1,0,result,n);
      return result;
    }

    static void findAll(String curr,int open,int close,List<String> res,int n){
        if(curr.length() ==2*n) {
            res.add(curr);
          //  return;
        }
        if(open < n)
            findAll(curr+"(",open+1,close,res,n);
        if(close < open)
            findAll(curr+")",open,close+1,res,n);
    }
    static void generate(List<String> res, int open, int close, int n, String str){
        if(str.length() ==2*n)
            res.add(str);
        if(open < n)
            generate(res,open+1,close,n,str+"(");
        if(close < open)
            generate(res,open,close+1,n,str+")");
    }

    public static void main(String args[]){

        System.out.println(generate(3));
    }
}
