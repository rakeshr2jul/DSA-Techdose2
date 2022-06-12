package bitmanipulations;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res=0;
        for(int n : nums){
             res = n ^ res;
        }
        return res;
    }


    public static void main(String args[]){
     //4,1,2,1,2
      int a [] ={2,2,3};
      System.out.println(singleNumber(a));
    }
}
