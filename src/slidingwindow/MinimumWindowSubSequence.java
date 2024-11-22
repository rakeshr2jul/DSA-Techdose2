package slidingwindow;

public class MinimumWindowSubSequence {

        //LT 727
    static String  minSubSeq(String str, String tar){
        // Save the size of str1 and str2
        int sizeStr1 = str.length();
        int sizeStr2 = tar.length();
        // Initialize length to a very large number (infinity)
        float length = Float.POSITIVE_INFINITY;
        // Initialize pointers to zero and the min_subsequence to an empty string
        int indexS1 = 0;
        int indexS2 = 0;
        int flag =0;
        String minSubsequence = "";
        int[] arr = new int[2];
        arr[0] = sizeStr1;
        arr[1] = sizeStr2;

        while (indexS1<sizeStr1){
            System.out.println("\tIteration no. " + indexS1 + " starts");

            if(indexS2 ==-1){
                flag = indexS2;
                indexS2 = sizeStr2 -1;
            }

            if(str.charAt(indexS1) == tar.charAt(indexS2)){
                // If the pointed character is the same
                // in both dsa.strings increment index_s2
                indexS2 += 1;
            }

            if(indexS2== sizeStr2){
                int start = indexS1;
                int end = indexS1+1;
            }

            indexS1+=1;
        }

        return minSubsequence;


    }


    public static void main(String args[]){


    }
}
