package ms;

public class OriginalArrayFromPreFixArray {
     // LT 2433 https://www.youtube.com/watch?v=KPbhfhp_WKY
    public static int[] findArray(int[] pref) {
       int ans[] = new int[pref.length];
       int xo=0;

       for(int i=0;i<pref.length;i++){
           ans[i] = xo ^ pref[i];
           xo^=ans[i];
       }
       return ans;
    }

    public static void main(String args[]){
       int pref [] ={5,2,0,3,1};

      int ans []= findArray(pref);

      for(int a: ans){
          System.out.print(a+" ");
      }

    }
}
