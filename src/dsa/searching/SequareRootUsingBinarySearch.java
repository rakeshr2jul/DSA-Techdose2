package dsa.searching;

public class SequareRootUsingBinarySearch{
    // LT 69 easy
    static int sqrt(int x){

        if(x<=1){
            return x;
        }
        int start=1;
        int end = x;
        int ans =1;
        while (start < end){
           int mid = (start+end)/2;
           if(mid > x/mid){
               end= mid;
           }else {
               ans =  mid;
               start = mid + 1;
           }

        }
      return  ans;

    }

    public static void main(String args[]){

        System.out.println("=="+sqrt(9));
    }
}
