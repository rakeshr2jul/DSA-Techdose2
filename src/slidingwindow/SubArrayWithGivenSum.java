package slidingwindow;

public class SubArrayWithGivenSum {


    static boolean checkSubarrayWithGivenSum(int arr[],int target){

        int sum = 0;
        int curr =0;

        for(int i =0;i < arr.length;i++){
             curr += arr[i];
            while (target < curr){
                curr -= arr[sum];
                sum++;
            }
            if(curr==target)
                return true;
        }
      return false;
    }


    public static void main(String args[]){
        int arr[] ={23,2,4,6,6};
        int target = 29;

    System.out.println(checkSubarrayWithGivenSum(arr,target));
    }
}
