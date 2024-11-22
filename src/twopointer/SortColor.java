package twopointer;

public class SortColor {
     // LC 75
    public static void sortColors(int nums[]){
        int low =0;
        int high = nums.length-1;
        int mid =0;
        while (mid<= high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
              mid++;
            }else {
                swap(nums,mid,high);
                high--;
               // mid--;
            }
        }

       for(int n : nums){
           System.out.print(n+",");
       }
    }

    public static void sortColor2(int nums[]){
        int count0=0,count1=0,count2=0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)
                count0++;
            if(nums[i]==1)
                count1++;
            if(nums[i]==2)
                count2++;
        }
      //  System.out.print(count0+" "+count1+" "+count2);
        for(int i = 0; i < nums.length; i++) {
            if (i < count0) {nums[i] = 0;}
            else if (i < count0 + count1) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
        for(int n : nums){
            System.out.print(n+",");
        }
    }

    private static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
           int nums[] = {2,0,2,1,1,2,0,0};

           sortColors(nums);
           sortColor2(nums);
    }
}
