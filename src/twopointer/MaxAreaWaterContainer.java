package twopointer;


//11. Container With Most Water
public class MaxAreaWaterContainer {

    public static int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n-1;

        int area = (right-left) * Math.min(height[left],height[right]);
        while (left < right){
            if(height[left] < height[right]){
               left++;
            }else{
                right--;
            }
            area =Math.max(area,Math.min(height[left],height[right])* (right-left)) ;
        }
        return area;
    }

    public static void main (String args[]){
       // int heights[]= {1,1};
        int heights[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }

}
