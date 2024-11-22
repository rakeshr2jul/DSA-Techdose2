package dsa.strings;

public class PowerSet {

    public static void powerset(String str,int n, String curr){

        if(n == str.length()){
            System.out.println(curr);
            return;
        }
        powerset(str,n+1,curr+ str.charAt(n));
        powerset(str,n+1,curr);

    }

    public static void permute(String s,int l ,int r){
         if(l==r){

             System.out.println(s);
             return;
         }

    }


    public static void main(String args[]){
        String str ="abc";
        powerset(str,str.length()-1,"");
    }
}
