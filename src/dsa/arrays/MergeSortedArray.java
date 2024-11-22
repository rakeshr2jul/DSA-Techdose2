package dsa.arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1.length==0 && nums2.length==00 && n ==0)
            return;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j>=0){
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
               nums1[k--] = nums2[j--];
        }
        while(j >= 0){
            nums1[k--]= nums2[j--];
        }
    }

    public static void main(String args[]){

        int num1[]={4,8,9,0,0,0};
        int m =3;
        int num2[]={3,6,10};
        int n=3;
        merge(num1,m,num2,n);
        for(int n1 : num1)
             System.out.print(n1);


    }
}
