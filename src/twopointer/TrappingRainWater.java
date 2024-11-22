package twopointer;

//42. Trapping Rain Water
public class TrappingRainWater {

    public static int trap(int[] height) {
       int total =0,lmax=0,rMax=0;
       int maxLeft[] = new int[height.length];
       int maxRight[] = new int[height.length];


       for(int i =0;i<height.length;i++){
           lmax = Math.max(lmax,height[i]);
           maxLeft[i]=lmax;
       }
       for(int i=height.length-1;i>=0;i--){
            rMax= Math.max(rMax,height[i]);
            maxRight[i]=rMax;
       }
       for(int i =0;i<height.length;i++){
           int h = Math.min(maxLeft[i],maxRight[i]);
            total=total+h-height[i];
        }

       return total;
    }

    public static int trapWater2(int height[]){
        int n = height.length;

        if(n <=2)
            return 0;

        int totalWater =0;
        int maxLeft = height[0];
        int maxRight= height[n-1];
        int left = 1;
        int right = n-2;
        while(left <= right){
            if(maxLeft < maxRight){
                if(height[left] >= maxLeft) {
                    maxLeft = height[left];
                }else {
                    totalWater=totalWater+maxLeft-height[left];
                }
                left++;
            }else {
                if(height[right]>=maxRight)
                    maxRight=height[right];
                else
                    totalWater=totalWater+maxRight-height[right];
                right--;
            }

        }


      return totalWater;

    }

    public static void main(String args[]){
        int height[] ={4,2,0,3,2,5};

      System.out.println(trapWater2(height)) ;
    }
}
